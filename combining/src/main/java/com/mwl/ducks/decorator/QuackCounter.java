package com.mwl.ducks.decorator;

import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.observer.Observer;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 装饰者模式，计数功能
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
