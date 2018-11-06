package com.mwl.duck.behavior;

import com.mwl.duck.behavior.FlyBehavior;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {

  public void fly() {
    System.out.println("I'm flying!!!");
  }
}
