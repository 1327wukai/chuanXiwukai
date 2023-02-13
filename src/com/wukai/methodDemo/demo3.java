package com.wukai.methodDemo;

//比较两个数组是否相等
public class demo3 {
    public static void main(String[] args) {
        int arrs1[] = {12, 32, 21};
        int arrs2[] = {122, 32, 21,5};
        System.out.println(equalsArray(arrs1, arrs2));
    }

    private static boolean equalsArray(int[] a, int[] b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
