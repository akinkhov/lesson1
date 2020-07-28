package com.sbrf.demo;
public class zad16 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 50000; i++) {
            if (String.valueOf(i).contains("2")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

