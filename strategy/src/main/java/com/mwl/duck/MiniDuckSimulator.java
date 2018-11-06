package com.mwl.duck;

import com.mwl.duck.behavior.FlyRocketPowered;

/**
 * @author mawenlong
 * @date 2018/11/06
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
