package com.wukai.forCycle;

public class Shuixianhua {
    public static void main(String[] args) {
        int s;
        for (s=100;s<1000;s++){
            int ge=s%10;
            int shi=s/10%10;
            int bai=s/100%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==s){
                System.out.println(s);
            }
        }
    }
}