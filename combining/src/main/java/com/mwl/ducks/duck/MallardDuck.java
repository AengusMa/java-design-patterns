package com.mwl.ducks.duck;

import com.mwl.ducks.observer.Observable;
import com.mwl.ducks.observer.Observer;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 被观察者
 */
public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
