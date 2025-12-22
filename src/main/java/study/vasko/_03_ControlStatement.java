package src.main.java.study.vasko;

public class _03_ControlStatement {
  public static void main(String[] args) {
    int i = 10;

    {
      int k = 15;
      System.out.println(i);
      System.out.println(k);
    }

    int testScore = 59;
    System.out.println("You've got");
    if (testScore > 90) {
      System.out.println("An Excellent");
    } else if (testScore >= 75) {
      System.out.println("a Good");
    } else if (testScore >= 60) {
      System.out.println("a Satisfactory");
    } else {
      System.out.println("a bad");
    }
    System.out.println("mark");
  }
}
