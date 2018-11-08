package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * Decaf咖啡
 */
public class Decaf extends Beverage{

  public Decaf() {
    description="Decaf Coffee";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}