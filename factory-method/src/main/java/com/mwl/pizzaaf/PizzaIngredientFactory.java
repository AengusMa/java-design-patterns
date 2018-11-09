package com.mwl.pizzaaf;

import com.mwl.pizzaaf.ingredient.Cheese;
import com.mwl.pizzaaf.ingredient.Clams;
import com.mwl.pizzaaf.ingredient.Dough;
import com.mwl.pizzaaf.ingredient.Pepperoni;
import com.mwl.pizzaaf.ingredient.Sauce;
import com.mwl.pizzaaf.ingredient.Veggies;

/**
 * @author mawenlong
 * @date 2018/11/9
 *
 * 原料工厂接口
 */
public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Veggies[] createVeggies();

  Pepperoni createPepperoni();

  Clams createClam();
}
