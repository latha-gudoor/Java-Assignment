// Write a program which accepts a string like "This is nice" and converts it to a string 
//like "This1 is2 nice3"
package com.wbl.Strings;

public class ChangingString {

	public static void main(String[] args) {

		String str = "This is nice";
		System.out.println("Given String : " + str);
		String s[] = str.split(" ");
		s[0]=s[0]+1;
		s[1]=s[1]+2;
		s[2]=s[2]+3;
		System.out.print("Modified String : " + s[0]+" "+s[1]+" "+s[2]);
	}

}
