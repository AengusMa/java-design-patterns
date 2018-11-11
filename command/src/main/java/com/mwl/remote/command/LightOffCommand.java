package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class LightOffCommand implements Command {

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
