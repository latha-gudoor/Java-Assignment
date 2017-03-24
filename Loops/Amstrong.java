package com.wbl.Loops;

import java.util.Scanner;

/* Write a program  to check an armstrong number i.e. whether the if we power
 *  up the each individual number to the total number of digits in the number 
 *  and add them it should be equal to the number itself. For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
    		FYI: ^ means is to the power.*/


public class Amstrong {

	public void amstrongNum(int n){
		int sum=0,rem,temp;  
		//int n=153;//It is the number to check armstrong  
		temp=n;  
		while(n>0)  
		{  
			rem=n%10;  
			n=n/10;  
			sum=sum+(rem*rem*rem);  
		}  
		if(temp==sum)  
			System.out.println("armstrong number");   
		else  
			System.out.println("Not armstrong number");   
	}
	public static void main(String[] args) {
		Amstrong num = new Amstrong();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		num.amstrongNum(number);
	}

}
