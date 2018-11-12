package com.mwl.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 枚举适配成迭代器，适配器需要实现迭代器
 */
public class EnumerationIterator implements Iterator {

  private Enumeration enumeration;

  public EnumerationIterator(Enumeration enumeration) {
    this.enumeration = enumeration;
  }

  public boolean hasNext() {
    return enumeration.hasMoreElements();
  }

  public Object next() {
    return enumeration.nextElement();
  }

  public void remove() {
    throw new UnsupportedOperationException("remove");
  }


}
