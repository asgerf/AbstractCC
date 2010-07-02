/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class AIntervalSet extends PSet
{
  private PChar _left_;
  private PChar _right_;

  public AIntervalSet()
  {}

  public AIntervalSet(
    PChar _left_,
    PChar _right_)
  {
    setLeft(_left_);

    setRight(_right_);

  }
  public Object clone()
  {
    return new AIntervalSet(
             (PChar) cloneNode(_left_),
             (PChar) cloneNode(_right_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAIntervalSet(this);
  }

  public PChar getLeft()
  {
    return _left_;
  }

  public void setLeft(PChar node)
  {
    if(_left_ != null)
    {
      _left_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _left_ = node;
  }

  public PChar getRight()
  {
    return _right_;
  }

  public void setRight(PChar node)
  {
    if(_right_ != null)
    {
      _right_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _right_ = node;
  }

  public String toString()
  {
    return ""
           + toString(_left_)
           + toString(_right_);
  }

  void removeChild(Node child)
  {
    if(_left_ == child)
    {
      _left_ = null;
      return;
    }

    if(_right_ == child)
    {
      _right_ = null;
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    if(_left_ == oldChild)
    {
      setLeft((PChar) newChild);
      return;
    }

    if(_right_ == oldChild)
    {
      setRight((PChar) newChild);
      return;
    }

  }
}
