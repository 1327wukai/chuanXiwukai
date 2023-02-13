package com.wukai.homework;

import java.util.Scanner;

//5.查找 2-100 之间的质数(素数),质数又称素数。 一个大于 1 的自然数，除了 1 和它自身外，
//不能被其他自然数整除的数叫做质数； 否则称为合数(规定:1 既不是质数也不是合数)
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            zhishu(num);
        }

    }

    public static void zhishu(int n) {
        int count = 0;
        while (n <= 1 || n >= 100) {
            System.out.println("enter a number from 1 to 100");
            break;
        }
        while (n > 1 && n < 100) {
            for (int i = 2; i < 100; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("是质数");
                break;
            } else {
                System.out.println("不是质数是和数");
                break;
            }
        }
    }
}
