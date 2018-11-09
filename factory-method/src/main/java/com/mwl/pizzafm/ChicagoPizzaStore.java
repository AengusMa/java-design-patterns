package com.mwl.pizzafm;

import com.mwl.pizzafm.bean.ChicagoStyleCheesePizza;
import com.mwl.pizzafm.bean.ChicagoStyleClamPizza;
import com.mwl.pizzafm.bean.ChicagoStylePepperoniPizza;
import com.mwl.pizzafm.bean.ChicagoStyleVeggiePizza;
import com.mwl.pizzafm.bean.Pizza;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new ChicagoStyleVeggiePizza();
    } else if (type.equals("clam")) {
      return new ChicagoStyleClamPizza();
    } else if (type.equals("pepperoni")) {
      return new ChicagoStylePepperoniPizza();
    } else {
      return null;
    }
  }
}
