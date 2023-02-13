package com.wukai.arrayDemo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20) + 1;
        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        int n;
        while (true) {
            boolean flag = false;
            System.out.println("shuruyigeshu");
            n = scanner.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (n == a[i]) {
                    System.out.println("zhong");
                }

            }
        }
    }
}


