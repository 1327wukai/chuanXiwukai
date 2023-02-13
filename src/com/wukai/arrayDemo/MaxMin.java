package com.wukai.arrayDemo;

public class MaxMin {
    public static void main(String[] args) {
        int[] scores = {45, 76, 56, 86, 88, 99};
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            max = scores[i] > max ? scores[i] : max;
            min = scores[i] < min ? scores[i] : min;
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
