package com.wukai.arrayDemo;

import java.util.Arrays;

public class Shuzu1 {
    public static void main(String[] args) {
        int[] a = new int[3];//动态初始化
        double[] v = new double[4];
        int[] ages = {12, 24, 36};
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[2]);
        System.out.println(ages.length);
//        System.out.println(ages[4]);

        int[] money = {12, 34, 23, 54, 23};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);

//forecch
        for (int m :money
        ) {
            System.out.println("m"+m);
        }
    }
}
