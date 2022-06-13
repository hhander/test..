package com.demo1;

public class test {
    public static void main(String[] args) {

        test t = new test();




    }

    static {
        System.out.println("-----代码块在加载类时就触发----");
    }

        {
            System.out.println("======创建对象时触发======");
        }
    }

