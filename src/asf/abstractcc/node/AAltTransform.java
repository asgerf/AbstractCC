/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class AAltTransform extends PAltTransform
{
  private TLBrace _lBrace_;
  private final LinkedList _terms_ = new TypedLinkedList(new Terms_Cast());
  private TRBrace _rBrace_;

  public AAltTransform()
  {}

  public AAltTransform(
    TLBrace _lBrace_,
    List _terms_,
    TRBrace _rBrace_)
  {
    setLBrace(_lBrace_);

    {
      this._terms_.clear();
      this._terms_.addAll(_terms_);
    }

    setRBrace(_rBrace_);

  }
  public Object clone()
  {
    return new AAltTransform(
             (TLBrace) cloneNode(_lBrace_),
             cloneList(_terms_),
             (TRBrace) cloneNode(_rBrace_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAAltTransform(this);
  }

  public TLBrace getLBrace()
  {
    return _lBrace_;
  }

  public void setLBrace(TLBrace node)
  {
    if(_lBrace_ != null)
    {
      _lBrace_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _lBrace_ = node;
  }

  public LinkedList getTerms()
  {
    return _terms_;
  }

  public void setTerms(List list)
  {
    _terms_.clear();
    _terms_.addAll(list);
  }

  public TRBrace getRBrace()
  {
    return _rBrace_;
  }

  public void setRBrace(TRBrace node)
  {
    if(_rBrace_ != null)
    {
      _rBrace_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _rBrace_ = node;
  }

  public String toString()
  {
    return ""
           + toString(_lBrace_)
           + toString(_terms_)
           + toString(_rBrace_);
  }

  void removeChild(Node child)
  {
    if(_lBrace_ == child)
    {
      _lBrace_ = null;
      return;
    }

    if(_terms_.remove(child))
    {
      return;
    }

    if(_rBrace_ == child)
    {
      _rBrace_ = null;
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    if(_lBrace_ == oldChild)
    {
      setLBrace((TLBrace) newChild);
      return;
    }

    for(ListIterator i = _terms_.listIterator(); i.hasNext();)
    {
      if(i.next() == oldChild)
      {
        if(newChild != null)
        {
          i.set(newChild);
          oldChild.parent(null);
          return;
        }

        i.remove();
        oldChild.parent(null);
        return;
      }
    }

    if(_rBrace_ == oldChild)
    {
      setRBrace((TRBrace) newChild);
      return;
    }

  }

  private class Terms_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PTerm node = (PTerm) o;

      if((node.parent() != null) &&
          (node.parent() != AAltTransform.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != AAltTransform.this))
      {
        node.parent(AAltTransform.this);
      }

      return node;
    }
  }
}