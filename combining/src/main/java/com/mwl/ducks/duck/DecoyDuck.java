package com.mwl.ducks.duck;

import com.mwl.ducks.observer.Observable;
import com.mwl.ducks.observer.Observer;

/**
 * @author mawenlong
 * @date 2018/11/17
 */
public class DecoyDuck implements Quackable {
    private Observable observable;

    public DecoyDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("<< Silence >>");
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
        return "Decoy Duck";
    }
}
