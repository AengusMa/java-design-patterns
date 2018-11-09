package com.mwl.pizzafm;

import com.mwl.pizzafm.bean.NYStyleCheesePizza;
import com.mwl.pizzafm.bean.NYStyleClamPizza;
import com.mwl.pizzafm.bean.NYStylePepperoniPizza;
import com.mwl.pizzafm.bean.NYStyleVeggiePizza;
import com.mwl.pizzafm.bean.Pizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new NYStyleVeggiePizza();
    } else if (type.equals("clam")) {
      return new NYStyleClamPizza();
    } else if (type.equals("pepperoni")) {
      return new NYStylePepperoniPizza();
    } else {
      return null;
    }
  }
}
