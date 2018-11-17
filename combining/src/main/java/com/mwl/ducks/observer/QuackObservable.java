package com.mwl.ducks.observer;


/**
 * 抽象被观察者接口 声明了添加。
 * 通知观察者方法
 */
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();

}
