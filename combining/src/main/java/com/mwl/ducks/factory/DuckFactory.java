package com.mwl.ducks.factory;

import com.mwl.ducks.duck.DuckCall;
import com.mwl.ducks.duck.MallardDuck;
import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.duck.RedheadDuck;
import com.mwl.ducks.duck.RubberDuck;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 没有装饰者的鸭子生产
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

