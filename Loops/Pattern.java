package com.wbl.Loops;

//h. Write a program  that prints a pattern like below.

public class Pattern {


	public void pattern(int n){

		for(int i=1;i<=n;i++){ // n=5 i<=5 i=2
			for (int j=1;j<=i;j++){//1<=1
				System.out.print("*"); //*
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) {

		Pattern p = new Pattern();
		p.pattern(5);
	}
}
