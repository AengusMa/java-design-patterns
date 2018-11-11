package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class CeilingFanOffCommand implements Command {

  CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    ceilingFan.off();
  }
}
