package com.study.udemy.vasko;

public class _02_Operators {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    int c = a + b;
    int d = a - b;

    int e = a * b;
    int f = a / b;

    int g = a % b;

    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("e = " + e);
    System.out.println("f = " + f);
    System.out.println("g = " + g);

    a++;
    b--;

    System.out.println("new a = " + a );
    System.out.println("new b = " + b);

    ++a;
    --b;
    System.out.println(a);
    System.out.println(b);

    int n = 7;
    int m = 7;

    int res1 = 2*n++;
    int res2 = 2*++m;

    System.out.println("res1 = " + res1);
    System.out.println("res2 = " + res2);

    int x = 3;
    int y = 5;
    int z = 8;
    boolean boolVal = y != z;
    System.out.println("boolVal = " + boolVal);

    boolean boolVal2 = y > z;

    boolean resBool = boolVal || boolVal2;
    System.out.println("resBool = " + resBool);

    int res = x > y ? x : y;
    System.out.println("res = " + res);
  }
}
