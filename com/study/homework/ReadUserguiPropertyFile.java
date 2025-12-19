package com.study.homework;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import java.io.File;

public class ReadUserguiPropertyFile {
  public static void main(String[] args) {
    Configurations configs = new Configurations();
    try {
      Configuration config = configs.properties(new File("com/study/homework/usergui.properties"));

      String host = config.getString("database.host");
      int port = config.getInt("database.port");
      String user = config.getString("database.user");
      String password = config.getString("database.password");
      long timeout = config.getLong("database.timeout");

      System.out.println("Host: " + host);
      System.out.println("Port: " + port);
      System.out.println("User: " + user);
      System.out.println("Password: " + password);
      System.out.println("Timeout: " + timeout);

    } catch (ConfigurationException e) {
      e.printStackTrace();
    }
  }
}