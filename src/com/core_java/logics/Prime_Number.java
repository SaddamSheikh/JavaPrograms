package com.core_java.logics;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check : ");
        int no = sc.nextInt();
        int count=0;
        for (int i=1; i<=no ; i++) {
            if (no % i == 0)
                count++;
            else if (count > 2)
                break;
        }
        if(count==2)
            System.out.println("it is prime");
        else
            System.out.println("it is not a prime");
    }
}
