package com.mwl.ducks.composite;

import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 组合模式
 */
public class Flock implements Quackable {
    private ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}