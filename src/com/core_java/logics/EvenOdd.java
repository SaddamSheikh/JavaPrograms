package com.core_java.logics;
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want to check:");
        no = sc.nextInt();
        if(no % 2 == 0) System.out.println(no + " is an even no.");
        else System.out.println(no + " is not an even no.");

    }
}