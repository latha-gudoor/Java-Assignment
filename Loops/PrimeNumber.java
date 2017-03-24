package com.wbl.Loops;

import java.util.Scanner;

// Write a program  to check if a given number is prime or not.

public class PrimeNumber {


	private static Scanner n1;

	public static boolean prime(int n){
		if (n<=0){
			return false;
		}
		for (int i=2;i<=Math.sqrt(n);i++){
			if (n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		n1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = n1.nextInt();
		if (prime(n)){
			System.out.println(n + " is  a prime number ");
		}
		else{
			System.out.println(n + " is not a prime number ");
		}

	}

}
