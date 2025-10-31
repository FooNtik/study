package JavaBigInteger;

import java.io.*;
import java.math.*;

public class PrimalityTest {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String n = bufferedReader.readLine();

    bufferedReader.close();

    if (new BigInteger(n).isProbablePrime(100)) {
      System.out.println("prime");
    } else {
      System.out.println("not prime");
    }
  }
}
