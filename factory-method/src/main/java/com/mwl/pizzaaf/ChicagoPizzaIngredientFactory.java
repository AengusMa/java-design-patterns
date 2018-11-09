package com.mwl.pizzaaf;

import com.mwl.pizzaaf.ingredient.Cheese;
import com.mwl.pizzaaf.ingredient.Clams;
import com.mwl.pizzaaf.ingredient.Dough;
import com.mwl.pizzaaf.ingredient.Pepperoni;
import com.mwl.pizzaaf.ingredient.Sauce;
import com.mwl.pizzaaf.ingredient.Veggies;
import com.mwl.pizzaaf.ingredient.impl.BlackOlives;
import com.mwl.pizzaaf.ingredient.impl.Eggplant;
import com.mwl.pizzaaf.ingredient.impl.FrozenClams;
import com.mwl.pizzaaf.ingredient.impl.MozzarellaCheese;
import com.mwl.pizzaaf.ingredient.impl.PlumTomatoSauce;
import com.mwl.pizzaaf.ingredient.impl.SlicedPepperoni;
import com.mwl.pizzaaf.ingredient.impl.Spinach;
import com.mwl.pizzaaf.ingredient.impl.ThickCrustDough;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 芝加哥原料工厂
 */
public class ChicagoPizzaIngredientFactory
    implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  public Veggies[] createVeggies() {
    Veggies veggies[] = {new BlackOlives(),
        new Spinach(),
        new Eggplant()};
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FrozenClams();
  }
}
