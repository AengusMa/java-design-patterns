package com.mwl.pizzafm.bean;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class NYStylePepperoniPizza extends Pizza {

  public NYStylePepperoniPizza() {
    name = "NY Style Pepperoni Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
    toppings.add("Sliced Pepperoni");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}
