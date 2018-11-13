package com.mwl.barista;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 茶
 */
public class Tea extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}
