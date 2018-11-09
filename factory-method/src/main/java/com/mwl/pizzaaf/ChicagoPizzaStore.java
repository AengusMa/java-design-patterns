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
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
        new ChicagoPizzaIngredientFactory();

    if (item.equals("cheese")) {

      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style Cheese Pizza");

    } else if (item.equals("veggie")) {

      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("Chicago Style Veggie Pizza");

    } else if (item.equals("clam")) {

      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("Chicago Style Clam Pizza");

    } else if (item.equals("pepperoni")) {

      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("Chicago Style Pepperoni Pizza");

    }
    return pizza;
  }
}
