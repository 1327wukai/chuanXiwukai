package com.wukai.methodDemo;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
//        int first = 1;
//        int second = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fibonacci(i));
//        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fib(n);
    }

    public static void fib(int n) {
        int a[] = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(Arrays.toString(a));
    }

    public static int fibonacci(int n) {
        int[] res = {0, 1};
        if(n < 2) {
            return res[n];
        }
        int first = 0;
        int second = 1;
        int fibn = 0;
        for(int i = 2; i <= n; i++) {
            fibn = first + second;
            first = second;
            second = fibn;
        }
        return fibn;
    }
}
