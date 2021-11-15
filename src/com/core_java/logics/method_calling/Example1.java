package com.core_java.logics.method_calling;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        Example1 a1 = new Example1();
        int res = a1.add(a,b);
        System.out.println("Sum is : "+res);
    }
    int add(int a, int b) {
        return a+b;
    }
}
