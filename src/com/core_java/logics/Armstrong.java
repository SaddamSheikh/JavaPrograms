package com.core_java.logics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();
        int temp=no;
        int sum=0;
        int r;
        while (no!=0)
        {
            r=no%10;
            sum=sum+(r*r*r);
            no=no/10;
        }
        if(sum==temp)
        System.out.println("armstrong");
        else
            System.out.println("not an armstrong");
    }
}
