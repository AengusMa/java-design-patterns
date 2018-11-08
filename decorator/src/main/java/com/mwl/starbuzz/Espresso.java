package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * 浓缩饮料
 */
public class Espresso extends Beverage{

  public Espresso() {
    description="Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
