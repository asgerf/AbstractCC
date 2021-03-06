/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import asf.abstractcc.analysis.*;

public final class TRBkt extends Token
{
  public TRBkt()
  {
    super.setText("]");
  }

  public TRBkt(int line, int pos)
  {
    super.setText("]");
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TRBkt(getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTRBkt(this);
  }

  public void setText(String text)
  {
    throw new RuntimeException("Cannot change TRBkt text.");
  }
}
