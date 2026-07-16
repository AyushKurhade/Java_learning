// package com.searchAndSort;
import java.util.Arrays;
import java.util.Scanner;
public class _05_selectionSort {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();

	        int[] arr = new int[n];

	   System.out.println("Enter elements :");
	      for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }

System.out.println("Unsorted array: " + Arrays.toString(arr));

	        for (int i = 0; i < arr.length - 1; i++) {
	            int min = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[min]) {
	                    min= j;
	                }
	            }
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }

 System.out.println("Sorted array: " + Arrays.toString(arr));
}
}
