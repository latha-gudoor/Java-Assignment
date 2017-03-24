//Write a program to sort an array.

package com.wbl.Arrays;

public class SortingArray {

	public void Sort(int[] array) {
		int len = array.length;
		int temp = 0;

		System.out.println("Array Before Sorting :");

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// Sorting Using BubbleSorting

		for(int i = 0; i < len; i++) {
			for(int j=1; j < (len-i); j++) {
				if(array[j-1] > array[j]) { 
					temp = array[j-1]; 
					array[j-1] = array[j];
					array[j] = temp;
				} 
			} 
		} 
	}  
	public static void main(String[] args) {
		SortingArray arr = new SortingArray();

		int array[] = {12,9,2,3, 5, 6, 8, 0,}; 

		arr.Sort(array);
		System.out.println("Array After Sort");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		} 
	}  

}


