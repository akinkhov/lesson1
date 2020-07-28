package com.sbrf.demo;
import java.util.Scanner;
public class zad12 {
    public static void main(String[] args)
    {
        String s;
        int n;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        n = in.nextInt();
        for (int i = 0; i < s.length(); i++)
        {
            if (i != n)
            {
                char now = s.charAt(i);
                System.out.print(now);
            }
        }
    }
}