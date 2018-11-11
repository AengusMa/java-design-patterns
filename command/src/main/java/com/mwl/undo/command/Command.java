package com.mwl.undo.command;

public interface Command {

  void execute();

  void undo();
}
