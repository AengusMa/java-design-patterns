package com.mwl.barista;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 咖啡
 */
public class Coffee extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}
