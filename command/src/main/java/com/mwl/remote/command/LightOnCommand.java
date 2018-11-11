package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
