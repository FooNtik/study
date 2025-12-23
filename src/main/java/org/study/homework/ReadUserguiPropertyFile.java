package org.study.homework;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadUserguiPropertyFile {

  private static final Logger log =
          LogManager.getLogger(ReadUserguiPropertyFile.class);

  public static void main(String[] args) {
    Configurations configs = new Configurations();

    try {
      Configuration config = configs.properties("usergui.properties");

      log.info("Host: {}", config.getString("database.host"));
      log.info("Port: {}", config.getInt("database.port"));
      log.info("User: {}", config.getString("database.user"));
      log.info("Password: {}", config.getString("database.password"));
      log.info("Timeout: {}", config.getLong("database.timeout"));

    } catch (ConfigurationException e) {
      log.error("Failed to read usergui.properties", e);
    }
  }
}