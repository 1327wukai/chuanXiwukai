package com.wukai.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;
//升序
public class SortByNumber {
    public static void main(String[] args) {
        Integer a[] = new Integer[5];
        Scanner input = new Scanner(System.in);
        System.out.println("shuru");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("before sort ");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sort");
        System.out.println(Arrays.toString(a));
    }
}
