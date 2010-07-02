/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of SableCC.                             *
 * See the file "LICENSE" for copyright information and the  *
 * terms and conditions for copying, distribution and        *
 * modification of SableCC.                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package asf.abstractcc;

import java.util.*;

import asf.abstractcc.node.*;

public class NodeCast implements Cast
{
  public final static NodeCast instance = new NodeCast();

  private NodeCast()
  {}

  public Object cast(Object o)
  {
    return (Node) o;
  }
}
