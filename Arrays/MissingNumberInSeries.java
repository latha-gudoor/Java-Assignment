//  Write a program to find the missing number in a series of sorted numbers stored in an array.

package com.wbl.Arrays;

public class MissingNumberInSeries {
	
	
	public void numbers(int []arr){
	 
		int total=0;
		int sum =0;
		 int n=10;
		total =n*(n+1)/2;
		for(int i=0;i<arr.length;i++){
			 sum=arr[i]+sum;
		}
        int mnum=total-sum;
		System.out.println("missing number in seq " + mnum);
			
		}
		
		// method for Even number sequence
		public void missingEvenNumSeq(){
		int [] array = {2,4,8,10,12,14};
		int temp =2;
		
		for(int i=0;i<array.length-1;i++){
			if (array[i]!=array[i+1]-temp){
				temp=array[i+1]-temp;
		}
		}
		System.out.println("missing number is " + temp);

	}
	
	public static void main(String[] args) {

		MissingNumberInSeries num = new MissingNumberInSeries();
		num.missingEvenNumSeq();
		int []a = {1,3,6,2,7,8,5,9,10};
		num.numbers(a);
	}

}
