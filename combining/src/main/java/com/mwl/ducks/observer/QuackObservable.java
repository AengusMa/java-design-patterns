package com.mwl.ducks.observer;


public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();

}
