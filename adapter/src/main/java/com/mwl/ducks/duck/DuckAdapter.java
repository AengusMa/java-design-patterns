package com.mwl.ducks.duck;

import com.mwl.ducks.turkey.Turkey;
import java.util.Random;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 适配器需要实现实现想要转换的接口
 */
public class DuckAdapter implements Turkey {

  private Duck duck;
  private Random rand;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
    rand = new Random();
  }

  public void gobble() {
    duck.quack();
  }

  public void fly() {
    if (rand.nextInt(5) == 0) {
      duck.fly();
    }
  }
}
