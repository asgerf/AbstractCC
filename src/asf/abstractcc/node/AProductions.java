/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class AProductions extends PProductions
{
  private final LinkedList _prods_ = new TypedLinkedList(new Prods_Cast());

  public AProductions()
  {}

  public AProductions(
    List _prods_)
  {
    {
      this._prods_.clear();
      this._prods_.addAll(_prods_);
    }

  }
  public Object clone()
  {
    return new AProductions(
             cloneList(_prods_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAProductions(this);
  }

  public LinkedList getProds()
  {
    return _prods_;
  }

  public void setProds(List list)
  {
    _prods_.clear();
    _prods_.addAll(list);
  }

  public String toString()
  {
    return ""
           + toString(_prods_);
  }

  void removeChild(Node child)
  {
    if(_prods_.remove(child))
    {
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    for(ListIterator i = _prods_.listIterator(); i.hasNext();)
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

  private class Prods_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PProd node = (PProd) o;

      if((node.parent() != null) &&
          (node.parent() != AProductions.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != AProductions.this))
      {
        node.parent(AProductions.this);
      }

      return node;
    }
  }
}
