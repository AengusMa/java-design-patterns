package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * 饮料
 */
public abstract class Beverage {

  String description = "Unkown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
