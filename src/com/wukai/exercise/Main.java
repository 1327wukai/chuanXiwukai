package com.wukai.exercise;

public class Main {
    public static void main(String[] args) {
//        int a = 1500;
//        byte b = (byte) a;
//        System.out.println(b); // 12

        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;  //10 +11+ 4 -6+1+10
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);

    }
}
