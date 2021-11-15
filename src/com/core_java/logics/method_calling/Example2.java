package com.core_java.logics.method_calling;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value : ");
        int n =in.nextInt();
        int res = Example2.sumOfN(n);
        System.out.println("Sum is : "+res);
    }

    static int sumOfN (int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum +i;
        }
        return sum;
    }
}
