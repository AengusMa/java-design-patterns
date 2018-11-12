package com.mwl.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 枚举和迭代器的使用
 */
public class EI {

  public static void main(String args[]) {
    Vector<String> v = new Vector<String>(Arrays.asList(args));
    Enumeration<String> enumeration = v.elements();
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
    Iterator<String> iterator = v.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
