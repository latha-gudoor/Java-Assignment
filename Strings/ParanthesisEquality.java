// Write a program to check if a given string of parenthesis has balanced parenthesis 
//or not.For example a string as "(())" 
//is a valid string where as strings like ")(" or "(()))" are not valid strings.

package com.wbl.Strings;

public class ParanthesisEquality {

	public static void main(String[] args) {


		String s = new String("(welcome(friends(come))");

		int count1=0,count2=0;
		for(int i=0;i<s.length();i++){
			{
				if(s.charAt(i)=='('){
					count1++;
				}else if(s.charAt(i)==')'){
					count2++;
				}
			}
		}
		System.out.println("Open paranthesis Count : " + count1);
		System.out.println("Closing paranthesis count : " + count2);	
		if(count1==count2){
			System.out.println("paranthesis are balanced");
		}else{
			System.out.println("Paranthesis are not balanced");
		}

	}
}

