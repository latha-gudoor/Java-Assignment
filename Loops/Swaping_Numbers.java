package com.wbl.Loops;

/* Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.*/

public class Swaping_Numbers {
	int a,b;
	public void swap(int a,int b){

		System.out.println("before value : " + a);
		System.out.println("before value : " + b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(a);
		System.out.println(b);

	}

	public void swap_temp(int a,int b){
		int c=0;
		System.out.println("before value : " + a);
		System.out.println("before value : " + b);

		c=a; //  6 4 a=4 b=6 c=
		a=b;
		b=c;

		System.out.println("After : " + a);
		System.out.println("After : " + b);
	}
	public static void main(String[] args) {

		Swaping_Numbers numbers = new Swaping_Numbers();
		numbers.swap(12, 6);
		numbers.swap_temp(4, 6);
	}

}
