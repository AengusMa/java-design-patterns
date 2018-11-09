package com.mwl.pizzas;

import com.mwl.pizzas.bean.CheesePizza;
import com.mwl.pizzas.bean.ClamPizza;
import com.mwl.pizzas.bean.PepperoniPizza;
import com.mwl.pizzas.bean.Pizza;
import com.mwl.pizzas.bean.VeggiePizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    }
    return pizza;
  }
}
