package com.sbrf.demo;
import java.util.Scanner;
public class zad9 {
    public static void main(String[] args) {
        int n = 98;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int b = (int) Math.sqrt(i);
            for (int j = 2; j <=b; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i +" ");
            }
        }
    }
}

