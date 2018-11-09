package com.mwl.pizzas;

import com.mwl.pizzas.bean.Pizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class PizzaStore {

  private SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
