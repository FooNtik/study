package com.study.StringsTests.StringRegex;

import java.util.Scanner;

public class StringRegexSolution {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
      String IP = in.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }
  }
}
