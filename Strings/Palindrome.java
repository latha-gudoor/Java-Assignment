package com.wbl.Strings;

import java.util.Scanner;

public class Palindrome {

	public void palindrome(String str){

		String reverse ="";
		System.out.println("Given String : " + str);
		for(int i=str.length()-1;i>=0;i--){
			reverse = reverse+str.charAt(i);
		}
		System.out.println("reverse String : " + reverse);

		if ((str).equals(reverse)){
			System.out.println("Given String is Palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		Palindrome string = new Palindrome();
		string.palindrome(str1);
	}

}
