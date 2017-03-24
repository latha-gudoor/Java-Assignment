// Write a program to find the common number in any given two arrays.

package com.wbl.Arrays;

public class CommonNumber {
	int[] array1 = {12,35,65,37,89};
	int[] array2 = {34,12,65,58,89};

	public void commonArray(){

		for(int i=0;i<array1.length;i++){
			for (int j=0;j<array2.length;j++){
				if (array1[i]==array2[j]){
					System.out.print(array1[i]);
					System.out.print(" ");

				}
			}
		}
	}

	public static void main(String[] args) {

		CommonNumber cn = new CommonNumber();
		cn.commonArray();
	}

}
