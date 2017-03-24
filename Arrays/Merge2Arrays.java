//Write a program to merge 2 arrays.


package com.wbl.Arrays;

import java.util.Arrays;

public class Merge2Arrays {


	public static int[] mergeOfArrays(int[]A,int[]B){

		int [] C = new int[A.length+B.length];
		int i=0;
		int j=0; 
		int k=0;
		while(i< A.length && j<B.length){

			if(A[i]<B[j]){
				C[k]=A[i];
				i++;
			}
			else
			{
				C[k]=B[j];
				j++;
			}
			k++;
		}
		while(i<A.length){
			C[k]=A[i];
			i++;
			k++;
		}
		while(j<B.length){
			C[k]=B[j];
			j++;
			k++;
		}

		return C;
	}

	public static void main(String[] args) {

		int [] A = { 1,3,5,7,10};
		int [] B = { 2,4,6,0,12};

		int[] C = mergeOfArrays(A,B);
		System.out.println("merged Array" + Arrays.toString(C));
	}
}