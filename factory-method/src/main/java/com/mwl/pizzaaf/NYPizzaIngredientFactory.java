package com.mwl.pizzaaf;

import com.mwl.pizzaaf.ingredient.Cheese;
import com.mwl.pizzaaf.ingredient.Clams;
import com.mwl.pizzaaf.ingredient.Dough;
import com.mwl.pizzaaf.ingredient.Pepperoni;
import com.mwl.pizzaaf.ingredient.Sauce;
import com.mwl.pizzaaf.ingredient.Veggies;
import com.mwl.pizzaaf.ingredient.impl.FreshClams;
import com.mwl.pizzaaf.ingredient.impl.Garlic;
import com.mwl.pizzaaf.ingredient.impl.MarinaraSauce;
import com.mwl.pizzaaf.ingredient.impl.Mushroom;
import com.mwl.pizzaaf.ingredient.impl.Onion;
import com.mwl.pizzaaf.ingredient.impl.RedPepper;
import com.mwl.pizzaaf.ingredient.impl.ReggianoCheese;
import com.mwl.pizzaaf.ingredient.impl.SlicedPepperoni;
import com.mwl.pizzaaf.ingredient.impl.ThinCrustDough;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies() {
    Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FreshClams();
  }
}
