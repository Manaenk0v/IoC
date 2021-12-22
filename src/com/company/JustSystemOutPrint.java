package com.company;

public class JustSystemOutPrint implements Logger {
  @Override
  public void log(String message) {
    System.out.println(message);
  }
}
