/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import asf.abstractcc.analysis.*;

public final class TId extends Token
{
  public TId(String text)
  {
    setText(text);
  }

  public TId(String text, int line, int pos)
  {
    setText(text);
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TId(getText(), getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTId(this);
  }
}
