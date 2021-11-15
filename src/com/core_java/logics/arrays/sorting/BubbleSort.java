package com.core_java.logics.arrays.sorting;

import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        System.out.println("Enter Size");
        int s = in.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < s-1; i++) {
            for (int j = 0; j < s-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }

}
