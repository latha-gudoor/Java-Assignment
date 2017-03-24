package com.wbl.Loops;

/* Write a program that prints a fibonaci series that is a sequence of numbers like 
0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can
print 10 numbers or 15 or 20 or any desired number.*/

public class Fib {

	public static void main(String[] args) {

		int n=10;
		int[] arr = new int[10];
		arr[0]=0;
		arr[1]=1;
		for (int i=2;i<n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}