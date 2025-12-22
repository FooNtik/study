package src.main.java.study.vasko;

public class _05_ForLoop {
  public static void main(String[] args) {
    int factorialLimit = 10;
    int factorial = 1;
    for (int i = 1; i < factorialLimit; i++) {
      factorial *= i;
      System.out.println("Factorial = " + factorial);
    }
    System.out.println("Final factorial value = " + factorial);

    for (int i = 10; i >= 1; i--) {
      System.out.println("i = " + i);
    }

    int j = 10;
    while (j >= 1) {
      System.out.println("j = " + j);
      j--;
    }
  }
}
