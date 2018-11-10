package com.mwl.simplemote;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 打开电灯命令
 */
public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
