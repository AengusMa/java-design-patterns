package com.mwl.undo.command;
/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class LightOffCommand implements Command {

  private Light light;
  private int level;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    level = light.getLevel();
    light.off();
  }

  public void undo() {
    light.dim(level);
  }
}
