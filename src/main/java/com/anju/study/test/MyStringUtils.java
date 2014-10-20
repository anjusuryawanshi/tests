package com.anju.study.test;

public final class MyStringUtils {

  private MyStringUtils() {
  }

  public static String trim(String str){
    int len = str.length();
    int i = 0;
    while(i<len && str.charAt(i) <= ' '){
      i++;
    }
    while(len > 0 && str.charAt(len-1) <= ' '){
      len--;
    }
    return (i>0 || len < str.length()) ? str.substring(i, len) : str;
  }
}