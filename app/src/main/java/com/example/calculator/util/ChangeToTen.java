package com.example.calculator.util;

public class ChangeToTen {
    public static String wantonlyConversion(String a, int b) {//任意进制转换为十进制
        int r = 0;
        for (int i = 0; i < a.length(); i++) {
            r = (int) (r + formatting(a.substring(i, i + 1))//逐位返回输入字符串
                    * Math.pow(b, a.length() - i - 1));//分别乘以对应的进制的对应位数次方
        }
        String s = String.valueOf(r);
        return s;
    }

    public static int formatting(String a) {
        int i = 0;
        for (int u = 0; u < 10; u++) {
            if (a.equals(String.valueOf(u))) {
                i = u;
            }
        }
        if (a.equals("A")) {
            i = 10;
        }
        if (a.equals("B")) {
            i = 11;
        }
        if (a.equals("C")) {
            i = 12;
        }
        if (a.equals("D")) {
            i = 13;
        }
        if (a.equals("E")) {
            i = 14;
        }
        if (a.equals("F")) {
            i = 15;
        }
        return i;
    }
}
