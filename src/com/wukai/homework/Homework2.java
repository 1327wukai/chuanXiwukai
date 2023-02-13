package com.wukai.homework;

/*2.我国古代数学家张丘建在<算经>中出了一道"百钱买百鸡"的问题,题意是这样的:
 5 文钱可以买一只公鸡,3 文钱可以买 1 只母鸡,1 文钱可以买 3 只雏鸡, 现在用 100 文钱买 100 只鸡,那么公鸡,母鸡,雏鸡各有多少只?*/
public class Homework2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 33; j++) {
                int z = 100 - i - j;
                if (z % 3 == 0 && i * 5 + j * 3 + z / 3 == 100) {
                    System.out.println("公鸡:"+i+"母鸡:"+j+"雏鸡:"+z);
                }
            }
        }
    }
}
