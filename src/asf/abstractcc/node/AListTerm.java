/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class AListTerm extends PTerm
{
  private TLBkt _lBkt_;
  private final LinkedList _listTerms_ = new TypedLinkedList(new ListTerms_Cast());

  public AListTerm()
  {}

  public AListTerm(
    TLBkt _lBkt_,
    List _listTerms_)
  {
    setLBkt(_lBkt_);

    {
      this._listTerms_.clear();
      this._listTerms_.addAll(_listTerms_);
    }

  }
  public Object clone()
  {
    return new AListTerm(
             (TLBkt) cloneNode(_lBkt_),
             cloneList(_listTerms_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAListTerm(this);
  }

  public TLBkt getLBkt()
  {
    return _lBkt_;
  }

  public void setLBkt(TLBkt node)
  {
    if(_lBkt_ != null)
    {
      _lBkt_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _lBkt_ = node;
  }

  public LinkedList getListTerms()
  {
    return _listTerms_;
  }

  public void setListTerms(List list)
  {
    _listTerms_.clear();
    _listTerms_.addAll(list);
  }

  public String toString()
  {
    return ""
           + toString(_lBkt_)
           + toString(_listTerms_);
  }

  void removeChild(Node child)
  {
    if(_lBkt_ == child)
    {
      _lBkt_ = null;
      return;
    }

    if(_listTerms_.remove(child))
    {
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    if(_lBkt_ == oldChild)
    {
      setLBkt((TLBkt) newChild);
      return;
    }

    for(ListIterator i = _listTerms_.listIterator(); i.hasNext();)
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

  }

  private class ListTerms_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PListTerm node = (PListTerm) o;

      if((node.parent() != null) &&
          (node.parent() != AListTerm.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != AListTerm.this))
      {
        node.parent(AListTerm.this);
      }

      return node;
    }
  }
}
