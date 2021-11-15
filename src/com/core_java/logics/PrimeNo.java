package com.core_java.logics;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to check: ");
        int no= sc.nextInt();
        int count = 0;
        for (int i=1;i<=no;i++)
        {
           if(no%i==0)
               count++;
           else if(count>2)
               break;
        }
        if (count==2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
