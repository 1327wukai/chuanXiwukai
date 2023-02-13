package com.wukai.methodDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(add(a,b));
        System.out.println(sub(a, b));
        System.out.println(multiple(a, b));
        System.out.println(division(a, b));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
