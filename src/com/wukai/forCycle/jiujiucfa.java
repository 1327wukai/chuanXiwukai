package com.wukai.forCycle;

public class jiujiucfa {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        for (i = 1; i <10 ; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print( "  "+i+"*"+j+"="+i*j );
            }
            System.out.println(" ");
        }
//        Scanner scanner = new Scanner();

    }
}