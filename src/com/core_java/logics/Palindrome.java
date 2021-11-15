package com.core_java.logics;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int x = sc.nextInt();
        int sum = 0;
        int r;
        int temp = x;
        while(x!=0) {
            r = x % 10;
            sum = sum*10 + r;
            x = x / 10;
        }
        if (temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
