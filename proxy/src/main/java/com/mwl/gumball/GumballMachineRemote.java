package com.mwl.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author mawenlong
 * @date 2018/11/16
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
