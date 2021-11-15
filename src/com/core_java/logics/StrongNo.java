package com.core_java.logics;

import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no: ");
        int no = sc.nextInt();
        int r;
        int sum=0;
        int fact;
        int temp=no;
        while (no != 0)
        {

            fact = 1;
            r=no%10;
            for (int i=1; i<=r; i++)
            {
                fact=fact*i;

            }
            sum= sum+fact;
            no=no/10;
        }
        if (sum==temp)
            System.out.println("strong");
        else
            System.out.println("not strong");

    }
}
