package com.wukai.methodDemo;

public class demo4 {
    public static void main(String[] args) {
    fire();
    fire("uk", 33);
    fire("jp");
    }

    public static void fire() {
        System.out.println("默认发射一枚武器给米国！");
    }
    public static void fire(String location) {
        System.out.println("给"+location+"发射一枚武器！");
    }
    public static void fire(String location, int nums) {
        System.out.println("给" + location + "发射" + nums + "枚武器！");
    }
}
