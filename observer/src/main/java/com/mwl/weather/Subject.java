package com.mwl.weather;


public interface Subject {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  /**
   * 当状态该变时通知所有观察者
   */
  void notifyObservers();
}
