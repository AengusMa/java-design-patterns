package com.mwl.ducks.decorator;

import com.mwl.ducks.duck.Quackable;

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

    @Override
    public String toString() {
        return duck.toString();
    }
}
