package com.mwl.duck.behavior;

import com.mwl.duck.behavior.QuackBehavior;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 不会叫
 */
public class MuteQuack implements QuackBehavior {

  public void quack() {
    System.out.println("<< Silence >>");
  }
}
