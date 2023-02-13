package com.wukai.homework;

import java.util.Scanner;

//4.输入一批整数,输出其中的最大值和最小值,输入字符串"y"结束循环
public class Homework4 {
    public static void main(String[] args) {
        System.out.println("请输入一些数字，输入y结束&&输出最大值和最小值 \n");
        int max; // 最大值
        int min; // 最小值
        int num; // 输入的整数
        Scanner input = new Scanner(System.in);
        max = min = num = input.nextInt();
        while (input.nextInt()!=0) { // 把零排除在外，0用作中止程序
            if (num > max) {
                max = num; // 如果大于目前的最大值，进行替换
            }
            if (num < min) {
                min = num; // 如果小于目前的最小值，进行替换
            }
            System.out.println("请继续输入，输入y中止程序");
            num = input.nextInt();
        }
        System.out.println("最大值为：" + max + "最小值为：" + min);

    }
}
