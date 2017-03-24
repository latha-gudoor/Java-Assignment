//Assignment Program: largest number in given array

package com.wbl.Arrays;

public class LargestNumber {

	int[] numbers = {9,7,623,5,28};
	int largest= numbers[0];

	public void largest(){

		for(int i=1;i<numbers.length;i++){
			if (numbers[i] > largest)
				largest= numbers[i];
		}
		System.out.println(largest);

	}


	public static void main(String[] args) {
		LargestNumber l =new LargestNumber();
		l.largest();
	}

}
