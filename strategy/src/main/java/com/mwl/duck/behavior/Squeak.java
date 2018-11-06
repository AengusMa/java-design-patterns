package com.mwl.duck.behavior;

import com.mwl.duck.behavior.QuackBehavior;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {

  public void quack() {
    System.out.println("Squeak");
  }
}
