/*  Write a program to find whether a given number is perfect or not?
Ex - i/p - 6
o/p - This is a perfect number*/

package com.wbl.Loops;

import java.util.Scanner;

public class PerfectNumber {
	public static Scanner s;
	int perfect;
	public void perfect(int n){

		for(int i=1;i<n;i++){

			if(n%i==0){
				perfect=perfect+i;
			}
		}
		if (perfect ==n)
			System.out.println(n + " Is perfect Number");
		else
			System.out.println(n + " Is Not a Perfect Number");
	}

	public static void main(String[] args) {
		PerfectNumber p = new PerfectNumber();
		s = new Scanner(System.in);
		int num = s.nextInt();
		p.perfect(num);
	}

}
