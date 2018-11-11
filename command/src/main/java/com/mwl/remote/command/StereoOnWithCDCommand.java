package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class StereoOnWithCDCommand implements Command {

  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }
}
