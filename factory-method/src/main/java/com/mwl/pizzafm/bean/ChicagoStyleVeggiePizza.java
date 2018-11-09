package com.mwl.pizzafm.bean;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class ChicagoStyleVeggiePizza extends Pizza {

  public ChicagoStyleVeggiePizza() {
    name = "Chicago Deep Dish Veggie Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
