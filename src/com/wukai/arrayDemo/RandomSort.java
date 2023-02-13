package com.wukai.arrayDemo;

import java.util.Arrays;
import java.util.Random;
//洗牌
public class RandomSort {
    public static void main(String[] args) {
        int a[] = {21, 34, 56, 43, 65};
        Random random = new Random();
        int index;
        for (int i = 0; i < a.length; i++) {
            index = random.nextInt(a.length);
            if (i != index) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
