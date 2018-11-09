package com.mwl.singleton.classic;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 单例模式：不是线程安全，延迟实例化
 */
public class Singleton {

  private static Singleton uniqueInstance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  public String getDescription() {
    return "I'm a classic Singleton!";
  }
}
