package com.mwl.duck.behavior;

import com.mwl.duck.behavior.FlyBehavior;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 不会飞
 */
public class FlyNoWay implements FlyBehavior {

  public void fly() {
    System.out.println("I can't fly");
  }
}
