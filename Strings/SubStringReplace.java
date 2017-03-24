
//Write a program to find a substring in a given string and then replace it with another string.
// did some other methods for practice
package com.wbl.Strings;

public class SubStringReplace {

	//sun string and replacing with other string
	public void strReplace(String s){
		System.out.println("String s : " + s);
		System.out.println("sub string of " + s + " after replacing : " + s.substring(0, 5).replace("white", "black"));
		System.out.println("\n");
	}

	//different string methods

	public void subStrRep(String input){

		String str = " whitebox learning";
		System.out.println("String input " + str);
		str= str.substring(0, 6);
		System.out.println("sub string of input " + str);
		str= str.replace("wh", "fi");
		System.out.println("String after replacing " + str);
		System.out.println("original string : " + input);	
		// returns the string start from 3rd letter  
		System.out.println("string from 3rd letter : " + input.substring(2));
		//returns the  string between 0th to 4th index values means first 4 letters
		System.out.println("sub string from specified indexes : " + input.substring(0, 4));
		System.out.println("sub string after replace : " + input.substring(0, 4).replace("l", "a"));

		String str1 = "united states of america";
		System.out.println("String 1 : " + str1);
		System.out.println("length : " + str1.length());
		System.out.println("string after trim : " + str1.trim());
		System.out.println("character at particulat index : "+ str1.charAt(8));
		System.out.println("checking the starting char :" + str1.startsWith("w"));
		System.out.println(str1.concat(" USA"));
		System.out.println("last index of " + input + " is : " + str1.lastIndexOf(input));
		System.out.println("HashCode : " + str1.hashCode());
		String s2 = "california";
		System.out.println("Equality Check Boolean Result : " + input.equals(s2));
		System.out.println("\n");
	}

	//method -3 -- replacing
	public void subString(String s){
		String str = "United kingdom";
		if (str.contains(s)){
			str = str.replace(s,"America");

			System.out.println("String after replace :" + str);

		} else {
			System.out.println("no substring found");
			System.out.println("String : " + str);
		}

	}
	public static void main(String[] args) {
		SubStringReplace st = new SubStringReplace();

		System.out.println("Method-1 Output : ");
		st.strReplace("whitebox");
		System.out.println("Method-2 Output : ");
		st.subStrRep("california");
		System.out.println("Method-3 Output : ");
		st.subString("kingdom");

	}

}
