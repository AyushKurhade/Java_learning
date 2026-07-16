// package com.linearSearch; 

import java.util.Arrays;
import java.util.Scanner; 

public class _04_bubblesort{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the number of elements: "); 
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        
        System.out.println("Enter " + n + " integers:"); 
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt(); 
        } 
        
        System.out.println("Unsorted array: " + Arrays.toString(arr)); 
        
        // Bubble Sort Logic
        boolean f; 
        for (int i = 0; i < arr.length - 1; i++) { 
            f = true; 
            for (int j = 0; j < arr.length - 1 - i; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    f = false; 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
            if (f) { 
                break; 
            } 
        } 
                System.out.println("Sorted array: " + Arrays.toString(arr)); 
   
    } 
}
