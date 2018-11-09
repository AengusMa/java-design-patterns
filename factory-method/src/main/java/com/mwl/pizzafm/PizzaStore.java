package com.mwl.pizzafm;

import com.mwl.pizzafm.bean.Pizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  abstract Pizza createPizza(String type);
}
