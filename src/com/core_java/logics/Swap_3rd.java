package com.core_java.logics;

import java.util.Scanner;

public class Swap_3rd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First no. : ");
        int a = in.nextInt();
        System.out.println("Enter Second no. : ");
        int b = in.nextInt();
        int c = 0;

        c = a;
        a = b;
        b = c;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}