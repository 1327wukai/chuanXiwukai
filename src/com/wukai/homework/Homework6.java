package com.wukai.homework;
//从控制台输入打印的行数,打印等腰三角形
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
