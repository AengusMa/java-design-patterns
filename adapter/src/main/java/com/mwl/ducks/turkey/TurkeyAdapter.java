package com.mwl.ducks.turkey;

import com.mwl.ducks.duck.Duck;

/**
 * @author mawenlong
 * @date 2018/11/11
 *
 * 实现想要转换的接口
 */
public class TurkeyAdapter implements Duck {

  private Turkey turkey;

  /**
   * 取得需要适配的对象引用
   */
  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  public void quack() {
    turkey.gobble();
  }

  public void fly() {
//    火鸡飞行距离很短，所以调用多次
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}
