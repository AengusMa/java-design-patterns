package com.mwl.ducks.factory;

import com.mwl.ducks.duck.Quackable;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 鸭子生产工厂
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
