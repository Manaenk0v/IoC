package com.company;

import java.util.logging.Level;

public class JavaUtilLogger implements Logger {
  @Override
  public void log(String message) {
    java.util.logging.Logger.getGlobal().log(Level.WARNING, message);
  }
}
