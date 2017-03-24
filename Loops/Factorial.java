package com.wbl.Loops;

import java.util.Scanner;

//   Write a program  to calculate factorial of a given number. 
//You need to compute the factorial with one logic 
//that uses recursion and another logic without recursion.

public class Factorial {
	int fact=1;

	public void factorial(int n){
		if (n<=0){
			System.out.println("number should be greater than zero");
		}
		else{
			for (int i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println("Factorial number of " + n + " is : " + fact);
		}
	}

	// using recursion
	public int recursion(int n){
		if(n==0){
			return 1;
		} else{
			return n*recursion(n-1);
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		//calling the normal method
		f.factorial(number);
		// calling the recursion method
		System.out.println("result: " + f.recursion(5));
	}

}
