package com.study.udemy.vasko;

public class _04_WhileDo {
  public static void main(String[] args) {
    int finalBalance = 100_000;
    double currentBalance = 0;
    int payment = 10_000;
    int years = 0;
    double interestRate = 0.1;

    while (currentBalance < finalBalance) {
      currentBalance += payment;
      currentBalance = currentBalance + currentBalance * interestRate;
      years++;
      System.out.println("Year " + years + " - " + currentBalance);
    }

    do {
      currentBalance += payment;
      currentBalance = currentBalance + currentBalance * interestRate;
      years++;
      System.out.println("Year " + years + " - " + currentBalance);
    }
    while (currentBalance < finalBalance);
  }
}
