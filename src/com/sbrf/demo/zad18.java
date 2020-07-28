package com.sbrf.demo;

import java.util.Scanner;

import static java.lang.Math.max;

public class zad18{
        public static void main(String[] args) {

            int a,b,c,max;
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            int max1 = max(a, b);
        if(c>max1)max1=c;
            if(max1 >= a + b + c -max1) {
        System.out.println("Треугольник невозможен");
        }else {
                int i = a * a + b * b + c * c - 2 * max1 * max1;
                if(i >0) {
                System.out.println("Треугольник остроугольный");
                }else if(i == 0) {
                System.out.println("Треугольник прямоугольный");
                }else if(i < 0) {
                System.out.println("Треугольник тупоугольный");
                }
            }
        }
}