package com.wbl.Loops;

import java.util.Scanner;

// Write a program  that accepts input from the command line and then prints them.

public class CmdLineInput {

	private static Scanner s;
	private static Scanner num;

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		num = new Scanner(System.in);
		int input = num.nextInt();

		System.out.println("Enter any string : ");
		s = new Scanner(System.in);
		String str = s.next();

		System.out.println("Printing the number : " + input);
		System.out.println("Command Line string Input is : " + str);
	}

}
