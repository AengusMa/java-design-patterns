package com.mwl.duck;

import com.mwl.duck.behavior.FlyWithWings;
import com.mwl.duck.behavior.Quack;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 绿头鸭
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
