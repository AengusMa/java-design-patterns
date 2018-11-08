package com.mwl.starbuzz;

/**
 * @author mawenlong
 * @date 2018/11/07
 */
public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
//    订购Beverage，不需要调料
    System.out.println(beverage.getDescription()
        + " $" + beverage.cost());
//    制造DarkRoast对象
    Beverage beverage2 = new DarkRoast();
//    用Mocha装饰
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription()
        + " $" + beverage2.cost());

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription()
        + " $" + beverage3.cost());
  }
}
