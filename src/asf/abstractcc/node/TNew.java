/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import asf.abstractcc.analysis.*;

public final class TNew extends Token
{
  public TNew()
  {
    super.setText("New");
  }

  public TNew(int line, int pos)
  {
    super.setText("New");
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TNew(getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTNew(this);
  }

  public void setText(String text)
  {
    throw new RuntimeException("Cannot change TNew text.");
  }
}