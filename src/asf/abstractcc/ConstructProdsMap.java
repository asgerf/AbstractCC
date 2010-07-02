/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of SableCC.                             *
 * See the file "LICENSE" for copyright information and the  *
 * terms and conditions for copying, distribution and        *
 * modification of SableCC.                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package asf.abstractcc;

import java.util.*;

import asf.abstractcc.analysis.*;
import asf.abstractcc.node.*;

public class ConstructProdsMap extends DepthFirstAdapter
{
  public Map productionsMap =
    new TypedTreeMap(StringCast.instance,
                     NodeCast.instance);

  private String currentProd;

  public void caseAProd(AProd node)
  {
    currentProd = ResolveIds.name(node.getId().getText());
    productionsMap.put("P" + currentProd, node);
  }
}
