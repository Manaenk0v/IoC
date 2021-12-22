package com.company;

import java.util.Calendar;

public class LogManager {
  Logger logger;
  
  public LogManager(Logger logger) {
    this.logger = logger;
  }
  
  void log(String message) {
    logger.log(Calendar.getInstance().getTime() + ": " +message);
  }
}
