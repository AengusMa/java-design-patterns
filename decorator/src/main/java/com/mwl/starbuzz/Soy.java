package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 */
public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return 0.15 + beverage.cost();
  }
}
