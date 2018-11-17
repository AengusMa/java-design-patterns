package com.mwl.ducks.factory;

import com.mwl.ducks.decorator.QuackCounter;
import com.mwl.ducks.duck.DuckCall;
import com.mwl.ducks.duck.MallardDuck;
import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.duck.RedheadDuck;
import com.mwl.ducks.duck.RubberDuck;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 带有装饰者的鸭子生产工厂
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
