package com.mwl.pizzafm.bean;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class ChicagoStyleCheesePizza extends Pizza {

  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
