package com.sbrf.demo;
import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        String  s;
        Boolean a=true;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        for (int i = 0; i < s.length()/2; i++)
        {
                if (s.charAt(i) != s.charAt(s.length() - i - 1))
                    {
                    System.out.println("Не палиндром");
                    a=false;
                    break;
                    }
        }
    if(a)
        System.out.println("Палиндром");
    }
}