// package com.linearSearch;

import java.util.Scanner;
public class _02_secondOccurance {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter searching element :");
		int search = sc.nextInt();
		int counter = 0;
		boolean found = false;
		for(int i = 0 ; i < size ; i++) {
			if(arr[i]==search) {
				counter++; 			// finding second occurance 
			}
			if(counter==2) {
				found = true;
				System.out.println("Eleement found at index : "+i);
				break;
			}
			
		}
		if(!found) {
			System.out.println("Not found");
		}
		
	}

}
