package org.study.homework.vasko;

public class _01_Primitives {
  public static void main(String[] args) {
    System.out.println("Hello World! ");

    byte b = 20;
    short c = 200;
    int a = b +23;
    long myLongValue = 123_456_789_876_543_211_2L;

    float myFloatValue = 23.56f;
    double myDoubleValue = 45.56d;

    double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
    System.out.println("Sum = " + sum);

    float floatResult = myFloatValue/3;
    System.out.println("float result = " + floatResult);

    double myNewDouble = 23.56;
    System.out.println("myDoubleResult = " + myNewDouble/3);

    char char1 = 'A';
    char char2 = 'b';
    char char3 = '\n';
    char char4 = '^';
    char char5 = '\u00B6';

    System.out.println("Characters");
  }
}
