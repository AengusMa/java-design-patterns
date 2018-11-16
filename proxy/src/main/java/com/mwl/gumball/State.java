package com.mwl.gumball;

import java.io.Serializable;

/**
 * @author mawenlong
 * @date 2018/11/15
 */
public interface State  extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
