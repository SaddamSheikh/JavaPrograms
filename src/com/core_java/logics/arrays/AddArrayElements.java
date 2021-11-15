package com.core_java.logics.arrays;

import java.util.Scanner;

public class AddArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        System.out.println("Enter Size");
        int s = in.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[s];
        int sum = 0;
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < s; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is : "+ sum);
    }
}
