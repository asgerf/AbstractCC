/* This file was generated by SableCC (http://www.sablecc.org/). */

package asf.abstractcc.node;

import java.util.*;

import asf.abstractcc.analysis.*;

public final class ANewListTerm extends PListTerm
{
  private PProdName _prodName_;
  private TLPar _lPar_;
  private final LinkedList _params_ = new TypedLinkedList(new Params_Cast());

  public ANewListTerm()
  {}

  public ANewListTerm(
    PProdName _prodName_,
    TLPar _lPar_,
    List _params_)
  {
    setProdName(_prodName_);

    setLPar(_lPar_);

    {
      this._params_.clear();
      this._params_.addAll(_params_);
    }

  }
  public Object clone()
  {
    return new ANewListTerm(
             (PProdName) cloneNode(_prodName_),
             (TLPar) cloneNode(_lPar_),
             cloneList(_params_));
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseANewListTerm(this);
  }

  public PProdName getProdName()
  {
    return _prodName_;
  }

  public void setProdName(PProdName node)
  {
    if(_prodName_ != null)
    {
      _prodName_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _prodName_ = node;
  }

  public TLPar getLPar()
  {
    return _lPar_;
  }

  public void setLPar(TLPar node)
  {
    if(_lPar_ != null)
    {
      _lPar_.parent(null);
    }

    if(node != null)
    {
      if(node.parent() != null)
      {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    _lPar_ = node;
  }

  public LinkedList getParams()
  {
    return _params_;
  }

  public void setParams(List list)
  {
    _params_.clear();
    _params_.addAll(list);
  }

  public String toString()
  {
    return ""
           + toString(_prodName_)
           + toString(_lPar_)
           + toString(_params_);
  }

  void removeChild(Node child)
  {
    if(_prodName_ == child)
    {
      _prodName_ = null;
      return;
    }

    if(_lPar_ == child)
    {
      _lPar_ = null;
      return;
    }

    if(_params_.remove(child))
    {
      return;
    }

  }

  void replaceChild(Node oldChild, Node newChild)
  {
    if(_prodName_ == oldChild)
    {
      setProdName((PProdName) newChild);
      return;
    }

    if(_lPar_ == oldChild)
    {
      setLPar((TLPar) newChild);
      return;
    }

    for(ListIterator i = _params_.listIterator(); i.hasNext();)
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

  private class Params_Cast implements Cast
  {
    public Object cast(Object o)
    {
      PTerm node = (PTerm) o;

      if((node.parent() != null) &&
          (node.parent() != ANewListTerm.this))
      {
        node.parent().removeChild(node);
      }

      if((node.parent() == null) ||
          (node.parent() != ANewListTerm.this))
      {
        node.parent(ANewListTerm.this);
      }

      return node;
    }
  }
}
