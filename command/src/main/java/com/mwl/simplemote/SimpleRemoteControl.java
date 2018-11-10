package com.mwl.simplemote;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class SimpleRemoteControl {

  //插槽
  private Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
