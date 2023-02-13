package com.wukai.forCycle;

import java.util.Random;
import java.util.Scanner;

public class SuiJi {
    public static void main(String[] args) {


/*        Random r = new Random();
        int c = r.nextInt(9);
        System.out.println(c);
    }*/

        double peakHeight = 8848860;  // 山峰高度
        double paperThickness = 0.1;  // 纸张厚度

/*
        int count = 0;
        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println("count=" + count);
*/

/*
        int count2 = 0;
        //如果纸张的厚度小于山峰继折叠，直到高于山峰厚度退出
        for (; paperThickness < peakHeight; ) {
            //纸张每折叠厚度是他的两倍
            paperThickness *=2;
            count2++;//折叠的次数
        }
        System.out.println("count2=" + count2);
*/

/*        Scanner input = new Scanner(System.in);
        String password;
        while (true) {
            password = input.next();
            if (password.equals("520")) {
                System.out.println("mimazque");
            } break;

        }
*/

/*        Scanner scanner = new Scanner(System.in);
        int line;
        int cloum;
        while (true) {
            System.out.println("shu ru yi ge shu");
            if (scanner.hasNextInt()) {
                line = scanner.nextInt();
                if (line > 0) {
                    break;
                } else {
                    scanner.next();
                }
            }
        }
*/

/*
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
*/


        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int n=random.nextInt(100)+1;
        int num;
        int count=0;
        while (true) {
            count++;
            System.out.println("shuruyigeshu");
            num=scanner.nextInt();
            if (n==num) {
                System.out.println("ok");
                break;
            } else if (n > num) {
                System.out.println("xiao");
            } else {
                System.out.println("da");
            }
        }
        System.out.println("count="+count);
        System.out.println("over");
    }
}
