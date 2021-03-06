package com.mwl.gumball;

import java.rmi.RemoteException;

/**
 * @author mawenlong
 * @date 2018/11/16
 *
 * 糖果监视器
 */
public class GumballMonitor {
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
