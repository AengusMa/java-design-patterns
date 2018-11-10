package com.mwl.simplemote;

/**
 * @author mawenlong
 * @date 2018/11/09
 */
public class RemoteControlTest {

  public static void main(String[] args) {

    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageDoorOpenCommand garageOpen =
        new GarageDoorOpenCommand(garageDoor);

    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    remote.setCommand(garageOpen);
    remote.buttonWasPressed();
  }

}
