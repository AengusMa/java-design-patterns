package com.mwl.gumball;

/**
 * @author mawenlong
 * @date 2018/11/15
 *
 * 有25分钱
 */
public class HasQuarterState implements State {
    //不序列化此字段
    private transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
