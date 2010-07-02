/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of SableCC.                             *
 * See the file "LICENSE" for copyright information and the  *
 * terms and conditions for copying, distribution and        *
 * modification of SableCC.                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package asf.abstractcc;

import java.util.*;

import asf.abstractcc.analysis.*;
import asf.abstractcc.node.*;

import java.io.*;
import java.util.Vector;
import java.util.Enumeration;

public class GenLexer extends AnalysisAdapter
{
  private MacroExpander macros;
  private ResolveIds ids;
  private File pkgDir;
  private String pkgName;
  private AcceptStates[] acceptStatesArray;
  private Transitions transitions;

  public GenLexer(ResolveIds ids)
  {
    this.ids = ids;

    try
    {
      macros = new MacroExpander(
                 new InputStreamReader(
                   getClass().getResourceAsStream("lexer.txt")));
    }
    catch(IOException e)
    {
      throw new RuntimeException("unable to open lexer.txt.");
    }

    pkgDir = new File(ids.pkgDir, "lexer");
    pkgName = ids.pkgName.equals("") ? "lexer" : ids.pkgName + ".lexer";

    if(!pkgDir.exists())
    {
      if(!pkgDir.mkdir())
      {
        throw new RuntimeException("Unable to create " + pkgDir.getAbsolutePath());
      }
    }
  }

  public void caseStart(Start tree)
  {
    String[] names;
    int numStates = Math.max(1, ids.stateList.size());

    acceptStatesArray = new AcceptStates[numStates];
    names = new String[numStates];

    if(ids.stateList.size() == 0)
    {
      names[0] = "INITIAL";
    }
    else
    {
      Iterator iter = ids.stateList.iterator();
      for(int i = 0; i < numStates; i++)
      {
        names[i] = (String) iter.next();
      }
    }

    for(int i = 0; i < numStates; i++)
    {
      System.out.println(" State: " + names[i]);

      System.out.println(" - Constructing NFA.");
      ConstructNFA nfaConstructor = new ConstructNFA(ids, names[i]);
      tree.apply(nfaConstructor);
      System.out.println();

      NFA nfa = (NFA) nfaConstructor.getOut(tree);
      nfaConstructor = null;

      System.out.println(" - Constructing DFA.");
      DFA dfa = new DFA(nfa);
      System.out.println();

      System.out.println(" - resolving ACCEPT states.");
      acceptStatesArray[i] = new AcceptStates(dfa, ids, names[i]);
      tree.apply(acceptStatesArray[i]);
    }

    transitions = new Transitions();
    tree.apply(transitions);

//    createLexerException();
    createLexer();
  }

  private void createLexerException()
  {
    BufferedWriter file;

    try
    {
      file = new BufferedWriter(
               new FileWriter(
                 new File(pkgDir, "LexerException.java")));
    }
    catch(IOException e)
    {
      throw new RuntimeException("Unable to create " + new File(pkgDir, "LexerException.java").getAbsolutePath());
    }

    try
    {
      macros.apply(file, "LexerException", new String[] {pkgName});
    }
    catch(IOException e)
    {
      throw new RuntimeException("An error occured while writing to " +
                                 new File(pkgDir, "LexerException.java").getAbsolutePath());
    }

    try
    {
      file.close();
    }
    catch(IOException e)
    {}
  }

  private void createLexer()
  {
    try
    {
      String startState = "INITIAL";
      if(ids.stateList.size() > 0)
      {
        startState = (String) ids.stateList.getFirst();
      }

      DataOutputStream out = new DataOutputStream(
                               new BufferedOutputStream(
                                 new FileOutputStream(
                                   new File(pkgDir, "lexer.dat"))));

      out.writeInt(acceptStatesArray.length);
      for(int accSt = 0; accSt < acceptStatesArray.length; accSt++)
      {
        DFA dfa = acceptStatesArray[accSt].dfa;

        Vector outerArray = new Vector();

        for(int i = 0; i < dfa.states.size(); i++)
        {
          Vector innerArray = new Vector();

          DFA.State state = (DFA.State) dfa.states.elementAt(i);

          for(int j = 0; j < state.transitions.size(); j++)
          {
            DFA.Transition transition =
              (DFA.Transition) state.transitions.elementAt(j);

            innerArray.addElement(new int[] {
                                    ((int) transition.interval().start),
                                    ((int) transition.interval().end),
                                    transition.destination});
          }

          outerArray.addElement(innerArray);
        }

        out.writeInt(outerArray.size());
        for(Enumeration e = outerArray.elements(); e.hasMoreElements();)
        {
          Vector innerArray = (Vector) e.nextElement();
          out.writeInt(innerArray.size());
          for(Enumeration n = innerArray.elements(); n.hasMoreElements();)
          {
            int[] array = (int[]) n.nextElement();

            for(int i = 0; i < 3; i++)
            {
              out.writeInt(array[i]);
            }
          }
        }
      }

      final int stateNumber = acceptStatesArray.length;

      Vector outerArray = new Vector();

      for(int i = 0; i < stateNumber; i++)
      {
        DFA dfa = acceptStatesArray[i].dfa;
        Vector innerArray = new Vector();

        for(int j = 0; j < dfa.states.size(); j++)
        {
          DFA.State state = (DFA.State) dfa.states.elementAt(j);

          innerArray.addElement(new Integer(state.accept));
        }

        outerArray.addElement(innerArray);
      }

      out.writeInt(outerArray.size());
      for(Enumeration e = outerArray.elements(); e.hasMoreElements();)
      {
        Vector innerArray = (Vector) e.nextElement();
        out.writeInt(innerArray.size());
        for(Enumeration n = innerArray.elements(); n.hasMoreElements();)
        {
          Integer i = (Integer) n.nextElement();
          out.writeInt(i.intValue());
        }
      }
      out.close();
    }
    catch(IOException e)
    {
      throw new RuntimeException("An error occured while writing to " +
                                 new File(pkgDir, "Lexer.java").getAbsolutePath());
    }

  }
}
