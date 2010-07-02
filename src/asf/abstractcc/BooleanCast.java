/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of SableCC.                             *
 * See the file "LICENSE" for copyright information and the  *
 * terms and conditions for copying, distribution and        *
 * modification of SableCC.                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package asf.abstractcc;

import java.util.*;

public class BooleanCast implements Cast
{
  public final static BooleanCast instance = new BooleanCast();

  private BooleanCast()
  {}

  public  Object cast(Object o)
  {
    return (Boolean) o;
  }
}
