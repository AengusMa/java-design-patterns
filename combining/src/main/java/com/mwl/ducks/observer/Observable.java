package com.mwl.ducks.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mawenlong
 * @date 2018/11/17
 */
public class Observable implements QuackObservable {
    //观察者集合
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    //被观察者
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }

    public Iterator<Observer> getObservers() {
        return observers.iterator();
    }
}
