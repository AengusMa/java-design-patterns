package com.mwl.singleton.stat;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 急切实例化
 */
public class Singleton {

  private static Singleton uniqueInstance = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return uniqueInstance;
  }

  public String getDescription() {
    return "I'm a statically initialized Singleton!";
  }
}
