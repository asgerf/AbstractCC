/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class APlusBinOp extends PBinOp
{

  public APlusBinOp()
  {}
  public Object clone()
  {
    return new APlusBinOp();
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAPlusBinOp(this);
  }

  public String toString()
  {
    return "";
  }

  void removeChild(Node child)
  {}

  void replaceChild(Node oldChild, Node newChild)
  {}
}