package com.ChatGptDemo;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数：");
        int num = scanner.nextInt();
        int min = num;
        int max = num;
        while (true) {
            System.out.print("请输入整数：");
            String str = scanner.next();
            if (str.equals("y")) {
                break;
            }
            num = Integer.parseInt(str);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
    }
}



