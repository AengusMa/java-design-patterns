package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 *
 * 调料类,装饰者类
 */
public abstract class CondimentDecorator extends Beverage {

  @Override
  public abstract String getDescription();
}
