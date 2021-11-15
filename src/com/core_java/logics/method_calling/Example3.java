package com.core_java.logics.method_calling;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Example3 a1 = new Example3();
        int n = a1.getNum();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    int getNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        return in.nextInt();
    }
}
