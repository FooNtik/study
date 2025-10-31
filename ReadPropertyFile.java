import java.io.IOException;

public class ReadPropertyFile {
  public static void main(String[] args) throws IOException {
    System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
    String name = System.getProperty("name");
    System.out.println(name);
  }
}
