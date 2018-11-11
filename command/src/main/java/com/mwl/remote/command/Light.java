package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class Light {

  String location = "";

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + " light is on");
  }

  public void off() {
    System.out.println(location + " light is off");
  }
}
