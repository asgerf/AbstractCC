/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import asf.abstractcc.analysis.*;

public final class TDDot extends Token
{
  public TDDot()
  {
    super.setText("..");
  }

  public TDDot(int line, int pos)
  {
    super.setText("..");
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TDDot(getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTDDot(this);
  }

  public void setText(String text)
  {
    throw new RuntimeException("Cannot change TDDot text.");
  }
}
