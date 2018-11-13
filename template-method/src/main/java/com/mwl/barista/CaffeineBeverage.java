package com.mwl.barista;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 咖啡因饮料
 */
public abstract class CaffeineBeverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  abstract void brew();

  abstract void addCondiments();

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }

}
