package com.mwl.ducks.observer;

/**
 * @author mawenlong
 * @date 2018/11/17
 */
public class Quackologist implements Observer {

    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }
}

