package com.wukai.homework;

import java.util.Scanner;

//从控制台输入打印的行数(奇数),打印菱形
//输入一个大于 0 的奇数:
public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a single number:");
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            //上半部分
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }

            //下半部分
            for (int i = 1; i <= n - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}
