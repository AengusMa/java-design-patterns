package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * House Blend 咖啡
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
