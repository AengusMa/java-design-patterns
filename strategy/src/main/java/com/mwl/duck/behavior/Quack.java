package com.mwl.duck.behavior;

import com.mwl.duck.behavior.QuackBehavior;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 呱呱叫
 */
public class Quack implements QuackBehavior {

  public void quack() {
    System.out.println("Quack");
  }
}
