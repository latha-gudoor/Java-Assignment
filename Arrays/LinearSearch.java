//Write a program to perform a linear search on any given array.Linear search is the 
//basic search 
//where you look for the element to be searched in a sequential way.



package com.wbl.Arrays;

public class LinearSearch {

	int [] array = {1,2,3,4,5};
	int e= 3;
	boolean found;

	public void linearElementSearch(){
		for(int i=0;i<=array.length-1;i++){
			if (e==array[i]){
				found=true;
				System.out.println(e + " is present in array at the location " + i);
				System.out.println("Array length : " + array.length);
			}
		}
		if(found==false){
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {

		LinearSearch ls = new LinearSearch();
		ls.linearElementSearch();
	}

}
