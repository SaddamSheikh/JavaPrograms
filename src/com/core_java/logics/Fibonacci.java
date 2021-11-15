package com.core_java.logics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no 1: ");
        int f1= sc.nextInt();
        System.out.println("Enter no 2: ");
        int f2= sc.nextInt();
        int f3;
        System.out.print(f1);
        System.out.print(f2);
        for(int i=1;i<=5;i++)
        {
            f3= f1+f2;
            System.out.print(f3);
            f1=f2;
            f2=f3;
        }
    }
}
