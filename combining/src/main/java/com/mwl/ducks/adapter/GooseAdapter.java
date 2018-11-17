package com.mwl.ducks.adapter;

import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.observer.Observable;
import com.mwl.ducks.observer.Observer;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 适配器模式
 */
public class GooseAdapter implements Quackable {
    //适配的对象
    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Goose pretending to be a Duck";
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
