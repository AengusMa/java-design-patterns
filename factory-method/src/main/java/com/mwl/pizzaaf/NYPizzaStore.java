package com.mwl.pizzaaf;

import com.mwl.pizzaaf.pizza.CheesePizza;
import com.mwl.pizzaaf.pizza.ClamPizza;
import com.mwl.pizzaaf.pizza.PepperoniPizza;
import com.mwl.pizzaaf.pizza.Pizza;
import com.mwl.pizzaaf.pizza.VeggiePizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
        new NYPizzaIngredientFactory();

    if (item.equals("cheese")) {

      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Cheese Pizza");

    } else if (item.equals("veggie")) {

      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");

    } else if (item.equals("clam")) {

      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");

    } else if (item.equals("pepperoni")) {

      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("New York Style Pepperoni Pizza");

    }
    return pizza;
  }
}
