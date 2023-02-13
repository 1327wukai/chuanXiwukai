package com.wukai.homework;

import java.util.Scanner;
//1.从控制台输入任意一个大于 0 的整数,求各个位数的和,比如输入的是 123456,结果是:21
public class Homework1 {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int count = 0;
        int num;

        System.out.println("输入任意一个大于 0 的整数");
        num = input.nextInt();

        while (num>0) {
            num= num / 10;
            count++;
        }
        System.out.println("位数为"+count+"位");

        int sum=0;
        for (int i = 1; i <=count; i++) {
            sum = sum + (num % 10);
        }
        System.out.println("和为:"+sum);
    }*/


        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int num = input.nextInt();
//        int sum = 0;
//        while(num!=0) {
//            sum+=num%10;
//            num=num/10;
//        }
//        System.out.println("sum is:"+sum);
//
        //enter a number
        int n;
        int sum=0;
        while (true) {
            System.out.println("Enter a number :");
            if (input.hasNextInt()) {
                n = input.nextInt();
                if (n > 0) {
                    break;
                } else {
                    input.next();
                }
                while(n!=0) {
                    sum+=n%10;
                    n=n/10;
                }
                System.out.println("sum is:"+sum);
            }
        }
    }
}

