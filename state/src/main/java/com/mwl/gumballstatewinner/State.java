package com.mwl.gumballstatewinner;

/**
 * @author mawenlong
 * @date 2018/11/15
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
