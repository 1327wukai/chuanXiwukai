package com.wukai.homework;

import java.util.Scanner;

/*.从控制台输入打印的行数(奇数),打印空心菱形
输入一个大于 0 的奇数:*/
public class Homework8 {

    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            for(int i = 1 ; i <= n ; i++){
                for(int k = 1 ; k <= n - i ; k++){
                    System.out.print(" ");
                }
                for(int j = 1 ; j <= 2 * i - 1 ;j++){
                    if(j == 1 || j == 2 * i - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            for(int i = 1 ; i <= n-1 ; i++){
                for(int k = 1 ; k <= i ; k++){
                    System.out.print(" ");
                }

                for(int j = 1 ; j <= 2*(n-i)-1; j++){
                    if(j == 1 || j ==2*(n-i)-1){//2*n-1-2*i=2*(n-i)-1
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }
        }

    }
}