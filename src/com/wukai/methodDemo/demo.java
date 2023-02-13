package com.wukai.methodDemo;

public class demo {
    public static void main(String[] args) {
        int a = 10;
        change(a);//值传递
        System.out.println(a); // 10
    }

    public static void change(int a) {
        System.out.println(a); // 10
        a = 20;
        System.out.println(a); // 20
    }
}
