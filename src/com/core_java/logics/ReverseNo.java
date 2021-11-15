package com.core_java.logics;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check: ");
        int no = sc.nextInt();
        int r;
        int sum=0;
        while(no!=0)
        {
            r = no%10;
            sum = sum * 10 + r;
            no = no/10;
        }
        System.out.println(sum);
    }
}
