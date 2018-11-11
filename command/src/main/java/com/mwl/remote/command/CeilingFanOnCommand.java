package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class CeilingFanOnCommand implements Command {

  CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    ceilingFan.high();
  }
}
