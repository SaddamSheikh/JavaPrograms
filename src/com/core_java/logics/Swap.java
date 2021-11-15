package com.core_java.logics;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First no. : ");
        int a = in.nextInt();
        System.out.println("Enter Second no. : ");
        int b = in.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("a :"+a);
        System.out.println("b :"+b);

    }
}
