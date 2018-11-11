package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class GarageDoorUpCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}
