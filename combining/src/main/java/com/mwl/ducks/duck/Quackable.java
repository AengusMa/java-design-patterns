package com.mwl.ducks.duck;

import com.mwl.ducks.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
