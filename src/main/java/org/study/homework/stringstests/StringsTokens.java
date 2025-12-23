package org.study.homework.stringstests;

import java.util.Arrays;
import java.util.Scanner;

public class StringsTokens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();

    String[] tokens = s.split("[^A-Za-z]+");

    tokens = Arrays.stream(tokens)
        .filter(token -> !token.isEmpty())
        .toArray(String[]::new);

    System.out.println(tokens.length);
    for (String token : tokens) {
      System.out.println(token);
    }
  }
}
