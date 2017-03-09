package com.framgia.java;

/**
 * Created by framgia on 09/03/2017.
 */
public class Loop {
    public static void main(String[] args) {
        // Bài toán
        // Cho n <100, tình tổngn 1+2+...+n
        int n = 100;
        int sum = 0;
        //c1. for
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng 1>n " + sum);
        //c2 while
        sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Tổng 1>n " + sum);
    }
}
