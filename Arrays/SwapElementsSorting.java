
//Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.


package com.wbl.Arrays;

public class SwapElementsSorting {

	public void swap(){
		int [] array = {1,2,5,6,4};
		int a=2;
		int b=4;
		int  temp;
		System.out.println(" Printing given array : ");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}

		temp = array[a];
		array[a] = array[b];
		array[b] = temp;

		System.out.println("array after swaping the elements : ");
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]);		
		}

	}

	public static void main(String[] args) {
		SwapElementsSorting s = new SwapElementsSorting();
		s.swap();
	}

}
