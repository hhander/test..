package com.demo1;

import java.util.Random;

public class StaticDemo {

     private StaticDemo()
     {

     }


     public static String getVerifyCode(int n)
     {
          String mode = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
          String code = "";
          Random r = new Random();
          for (int i = 0; i < n; i++)
          {
               int rand1 = r.nextInt(mode.length());
               code = code + mode.charAt(rand1);
          }
          return code;
     }
}
