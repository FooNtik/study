package org.study.homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

  private static final Logger log =
          LogManager.getLogger(ReadPropertyFile.class);

  public static void main(String[] args) {
    Properties properties = new Properties();

    try (InputStream in = ReadPropertyFile.class
            .getClassLoader()
            .getResourceAsStream("config.properties")) {

      if (in == null) {
        log.error("config.properties not found in classpath");
        return;
      }

      properties.load(in);

      String name = properties.getProperty("name");
      String age = properties.getProperty("age");
      log.info("Name from config.properties: {}", name);
      log.info("Age from config.properties: {}", age);

    } catch (IOException e) {
      log.error("Failed to read config.properties", e);
    }
  }
}
