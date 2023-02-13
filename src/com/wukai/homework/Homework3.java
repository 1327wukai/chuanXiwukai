package com.wukai.homework;

import java.util.Scanner;

//3.从控制台输入任意一个大于 0 的整数, 将这个整数反转,比如输入:12345,反转成 54321
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        while (num != 0) {
            int a = num % 10;
            System.out.print(a);
            num = num / 10;
        }
    }
}
