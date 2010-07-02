/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.analysis;

import java.util.*;

import asf.abstractcc.node.*;

public class AnalysisAdapter implements Analysis
{
  private Hashtable in;
  private Hashtable out;

  public Object getIn(Node node)
  {
    if(in == null)
    {
      return null;
    }

    return in.get(node);
  }

  public void setIn(Node node, Object in)
  {
    if(this.in == null)
    {
      this.in = new Hashtable(1);
    }

    if(in != null)
    {
      this.in.put(node, in);
    }
    else
    {
      this.in.remove(node);
    }
  }

  public Object getOut(Node node)
  {
    if(out == null)
    {
      return null;
    }

    return out.get(node);
  }

  public void setOut(Node node, Object out)
  {
    if(this.out == null)
    {
      this.out = new Hashtable(1);
    }

    if(out != null)
    {
      this.out.put(node, out);
    }
    else
    {
      this.out.remove(node);
    }
  }
  public void caseStart(Start node)
  {
    defaultCase(node);
  }

  public void caseAGrammar(AGrammar node)
  {
    defaultCase(node);
  }

  public void caseAHelpers(AHelpers node)
  {
    defaultCase(node);
  }

  public void caseAHelperDef(AHelperDef node)
  {
    defaultCase(node);
  }

  public void caseAStates(AStates node)
  {
    defaultCase(node);
  }

  public void caseATokens(ATokens node)
  {
    defaultCase(node);
  }

  public void caseATokenDef(ATokenDef node)
  {
    defaultCase(node);
  }

  public void caseAStateList(AStateList node)
  {
    defaultCase(node);
  }

  public void caseAStateListTail(AStateListTail node)
  {
    defaultCase(node);
  }

  public void caseATransition(ATransition node)
  {
    defaultCase(node);
  }

  public void caseAIgnTokens(AIgnTokens node)
  {
    defaultCase(node);
  }

  public void caseARegExp(ARegExp node)
  {
    defaultCase(node);
  }

  public void caseAConcat(AConcat node)
  {
    defaultCase(node);
  }

  public void caseAUnExp(AUnExp node)
  {
    defaultCase(node);
  }

  public void caseACharBasic(ACharBasic node)
  {
    defaultCase(node);
  }

  public void caseASetBasic(ASetBasic node)
  {
    defaultCase(node);
  }

  public void caseAStringBasic(AStringBasic node)
  {
    defaultCase(node);
  }

  public void caseAIdBasic(AIdBasic node)
  {
    defaultCase(node);
  }

  public void caseARegExpBasic(ARegExpBasic node)
  {
    defaultCase(node);
  }

  public void caseACharChar(ACharChar node)
  {
    defaultCase(node);
  }

  public void caseADecChar(ADecChar node)
  {
    defaultCase(node);
  }

  public void caseAHexChar(AHexChar node)
  {
    defaultCase(node);
  }

  public void caseAOperationSet(AOperationSet node)
  {
    defaultCase(node);
  }

  public void caseAIntervalSet(AIntervalSet node)
  {
    defaultCase(node);
  }

  public void caseAStarUnOp(AStarUnOp node)
  {
    defaultCase(node);
  }

  public void caseAQMarkUnOp(AQMarkUnOp node)
  {
    defaultCase(node);
  }

  public void caseAPlusUnOp(APlusUnOp node)
  {
    defaultCase(node);
  }

  public void caseAPlusBinOp(APlusBinOp node)
  {
    defaultCase(node);
  }

  public void caseAMinusBinOp(AMinusBinOp node)
  {
    defaultCase(node);
  }

  public void caseAProductions(AProductions node)
  {
    defaultCase(node);
  }

  public void caseAProd(AProd node)
  {
    defaultCase(node);
  }

  public void caseAAlt(AAlt node)
  {
    defaultCase(node);
  }

  public void caseAAltTransform(AAltTransform node)
  {
    defaultCase(node);
  }

  public void caseANewTerm(ANewTerm node)
  {
    defaultCase(node);
  }

  public void caseAListTerm(AListTerm node)
  {
    defaultCase(node);
  }

  public void caseASimpleTerm(ASimpleTerm node)
  {
    defaultCase(node);
  }

  public void caseANullTerm(ANullTerm node)
  {
    defaultCase(node);
  }

  public void caseANewListTerm(ANewListTerm node)
  {
    defaultCase(node);
  }

  public void caseASimpleListTerm(ASimpleListTerm node)
  {
    defaultCase(node);
  }

  public void caseAProdName(AProdName node)
  {
    defaultCase(node);
  }

  public void caseAElem(AElem node)
  {
    defaultCase(node);
  }

  public void caseATokenSpecifier(ATokenSpecifier node)
  {
    defaultCase(node);
  }

  public void caseAProductionSpecifier(AProductionSpecifier node)
  {
    defaultCase(node);
  }

  public void caseAAst(AAst node)
  {
    defaultCase(node);
  }

  public void caseAAstProd(AAstProd node)
  {
    defaultCase(node);
  }

  public void caseAAstAlt(AAstAlt node)
  {
    defaultCase(node);
  }

  public void caseTPkgId(TPkgId node)
  {
    defaultCase(node);
  }

  public void caseTPackage(TPackage node)
  {
    defaultCase(node);
  }

  public void caseTStates(TStates node)
  {
    defaultCase(node);
  }

  public void caseTHelpers(THelpers node)
  {
    defaultCase(node);
  }

  public void caseTTokens(TTokens node)
  {
    defaultCase(node);
  }

  public void caseTIgnored(TIgnored node)
  {
    defaultCase(node);
  }

  public void caseTProductions(TProductions node)
  {
    defaultCase(node);
  }

  public void caseTAbstract(TAbstract node)
  {
    defaultCase(node);
  }

  public void caseTSyntax(TSyntax node)
  {
    defaultCase(node);
  }

  public void caseTTree(TTree node)
  {
    defaultCase(node);
  }

  public void caseTNew(TNew node)
  {
    defaultCase(node);
  }

  public void caseTNull(TNull node)
  {
    defaultCase(node);
  }

  public void caseTTokenSpecifier(TTokenSpecifier node)
  {
    defaultCase(node);
  }

  public void caseTProductionSpecifier(TProductionSpecifier node)
  {
    defaultCase(node);
  }

  public void caseTDot(TDot node)
  {
    defaultCase(node);
  }

  public void caseTDDot(TDDot node)
  {
    defaultCase(node);
  }

  public void caseTSemicolon(TSemicolon node)
  {
    defaultCase(node);
  }

  public void caseTEqual(TEqual node)
  {
    defaultCase(node);
  }

  public void caseTLBkt(TLBkt node)
  {
    defaultCase(node);
  }

  public void caseTRBkt(TRBkt node)
  {
    defaultCase(node);
  }

  public void caseTLPar(TLPar node)
  {
    defaultCase(node);
  }

  public void caseTRPar(TRPar node)
  {
    defaultCase(node);
  }

  public void caseTLBrace(TLBrace node)
  {
    defaultCase(node);
  }

  public void caseTRBrace(TRBrace node)
  {
    defaultCase(node);
  }

  public void caseTPlus(TPlus node)
  {
    defaultCase(node);
  }

  public void caseTMinus(TMinus node)
  {
    defaultCase(node);
  }

  public void caseTQMark(TQMark node)
  {
    defaultCase(node);
  }

  public void caseTStar(TStar node)
  {
    defaultCase(node);
  }

  public void caseTBar(TBar node)
  {
    defaultCase(node);
  }

  public void caseTComma(TComma node)
  {
    defaultCase(node);
  }

  public void caseTSlash(TSlash node)
  {
    defaultCase(node);
  }

  public void caseTArrow(TArrow node)
  {
    defaultCase(node);
  }

  public void caseTColon(TColon node)
  {
    defaultCase(node);
  }

  public void caseTId(TId node)
  {
    defaultCase(node);
  }

  public void caseTChar(TChar node)
  {
    defaultCase(node);
  }

  public void caseTDecChar(TDecChar node)
  {
    defaultCase(node);
  }

  public void caseTHexChar(THexChar node)
  {
    defaultCase(node);
  }

  public void caseTString(TString node)
  {
    defaultCase(node);
  }

  public void caseTBlank(TBlank node)
  {
    defaultCase(node);
  }

  public void caseTComment(TComment node)
  {
    defaultCase(node);
  }

  public void caseEOF(EOF node)
  {
    defaultCase(node);
  }

  public void defaultCase(Node node)
  {}
}
