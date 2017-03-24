
//Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.

package com.wbl.Strings;

public class ReverseString {

	public void reverseStr( ){
		// stringbuffer and stringbuilder strings are declared using stringbuffer
		///builder constructors only not with literals

		StringBuffer str = new StringBuffer("DONUT");
		StringBuilder str1 = new StringBuilder("stats");
		System.out.println("reverse string " + str.reverse());
		System.out.println("reverse string " + str1.reverse());

		// other  imp methods of stringbuffer/builder

		StringBuilder string = new StringBuilder("Welcome");
		string.append(" Everyone"); // here string is mutable..
		System.out.println("String after append : " + string);
		string.append(101);
		System.out.println("Modified String : " + string);
		System.out.println("after replace, printing the reverse String : " + string.replace(0, 6, "com").reverse());
	}

	// Reversing String without using StrinBuffer or Builder

	public void strReverse(String input){ // innovapath

		String rev = ""; // initialisation in not required 
		char [] array = new char[input.length()];
		System.out.println("Given String is : " + input);
		System.out.println("String Length : " + input.length());
		int j=0;
		for(int i=input.length()-1;i>=0;i--){
			array[j]=input.charAt(i);
			j++;
		}
		rev=new String(array); // converting character array to string--initialisation is done here
		System.out.println("Reverse String : " + rev);
		if ((rev).equals(input)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseStr();
		rs.strReverse("stats");
	}

}
