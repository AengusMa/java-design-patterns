package com.mwl.singleton.threadsafe;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 线程安全
 */
public class Singleton {

  private static Singleton uniqueInstance;

  private Singleton() {
  }

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  public String getDescription() {
    return "I'm a thread safe Singleton!";
  }
}
