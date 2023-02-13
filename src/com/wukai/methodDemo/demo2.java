package com.wukai.methodDemo;

public class demo2 {
    public static void main(String[] args) {
        int[] arrs = new int[]{12, 22, 33};
        change(arrs);
        System.out.println(arrs[1]);
    }

//    public static void change(int[] arrs) {
//        System.out.println(arrs[1]);
//        arrs[1] = 222;
//        System.out.println(arrs[1]);
//    }

    public static void change(int[] arrs) {
        arrs = new int[]{33, 44, 22};
        System.out.println(arrs[1]);
        arrs[1] = 222;
        System.out.println(arrs[1]);
    }
}
