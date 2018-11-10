package com.mwl.simplemote;

/**
 * @author mawenlong
 * @date 2018/11/09
 *
 * 关闭电灯命令
 */
public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
