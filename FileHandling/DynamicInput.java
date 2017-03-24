/*Write a program that takes input from user dynamically using below classes.
  			--> Scanner: Use this class to input 2 integer numbers and sum them.*/


package com.wbl.FileHandling;

import java.util.Scanner;

public class DynamicInput {

	private static Scanner num;

	public static int sum(int a,int b){
		int c =0;
		c=a+b;
		System.out.println("sum of " + a + " and " + b + " is : " + c);
		return c;
	}

	public static void main(String[] args) {
		int x,y;
		// input using Scanner

		num = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = num.nextInt();
		System.out.println("Enter first number : ");
		y = num.nextInt();
		System.out.println(sum(x, y));
	}

}
