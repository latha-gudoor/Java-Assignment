/*BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  			--> Scanner: Use this class to input 2 integer numbers and sum them.
  			--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  			--> DatainputStream: Use this class to input 2 integer numbers and multiply them.*/


package com.wbl.FileHandling;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubtractionISReader {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		// Using Scanner Class 
		System.out.println("Using Scanner Class : Enter numbers for addition  : ");
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		int firstnum= num.nextInt();
		int secondnum=num.nextInt();
		int sum=firstnum+secondnum;
		System.out.println("Sum of two numbers is : " + sum);

// BufferredReader class to input 2 integer numbers
	    System.out.println("Using InputStreamreader : input the numbers for Substraction : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String input = reader.readLine();
	    String input1 = reader.readLine();

	    int number = Integer.parseInt(input);
	    int n = Integer.parseInt(input1);
	    int c= number-n;
	    System.out.println("subtraction : " + c);
	    
	    //DatainputStream:class to input 2 integer numbers and multiply them.
	   
	    System.out.println(" Using DataInputStream imput the numbers for multiplication : ");
	    DataInputStream dis = new DataInputStream(System.in);
		String a = dis.readLine();
	    int num1 = Integer.parseInt(a);
		String b = dis.readLine();
	    int num2 = Integer.parseInt(b);
	    int product = num1 * num2;
	   System.out.println("product : " +product );
	   }
	}