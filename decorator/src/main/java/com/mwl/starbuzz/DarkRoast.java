package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * 深焙
 */
public class DarkRoast extends Beverage{

  public DarkRoast() {
    description="Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
