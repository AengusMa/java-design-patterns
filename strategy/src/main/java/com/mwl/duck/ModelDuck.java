package com.mwl.duck;

import com.mwl.duck.behavior.FlyWithWings;
import com.mwl.duck.behavior.Quack;

/**
 * @author mawenlong
 * @date 2018/11/06
 */
public class ModelDuck extends Duck {

  public ModelDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
