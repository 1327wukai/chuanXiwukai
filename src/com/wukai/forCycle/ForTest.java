package com.wukai.forCycle;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("shuru");
        int javacore = input.nextInt();
        if (javacore>12){
            System.out.println("ok");
        }

    final int m=1;
        switch (m){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
        }

        int s=153;
//        for (s=100;s<=999;s++){
            int ge=s%10;
            int shi=s/10%10;
            int bai=s/10/10%10;
            if (ge*ge+shi*shi+bai*bai==s){
                System.out.println("is");
            }

//        }
    }
}
