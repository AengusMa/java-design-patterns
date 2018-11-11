package com.mwl.remote.command;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class StereoOffCommand implements Command {

  Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }
}
