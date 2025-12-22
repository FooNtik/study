package src.main.java.study.StringsTests;

import java.util.Scanner;

public class Substrings {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();

    if (S.isEmpty() || S.length() > 100) {
      System.out.println("Error: String length must be between 1 and 100.");
      return;
    }

    if (!S.matches("[a-zA-Z]+")) {
      System.out.println("Error: String must contain only English letters (a-z, A-Z).");
      return;
    }
    int start = in.nextInt();
    int end = in.nextInt();
    int n = S.length();

    if (start < 0 || start >= end || end > n) {
      System.out.println("Error: Indices must satisfy 0 ? start < end ? " + n + ".");

    }

    System.out.println(S.substring(start, end));
  }
}
