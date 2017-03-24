//Write a program to reverse each individual word in a sentence.

package com.wbl.Strings;

public class RevIndWords {

	public static void revWordsinSenten(String input){
	String[] words = input.split(" ");
    
    String reverseStr = "";
     
    for (int i = 0; i < words.length; i++) 
    {
        String word = words[i];
         
        String reverseWord = "";
         
        for (int j = word.length()-1; j >= 0; j--) 
        {
            reverseWord = reverseWord + word.charAt(j);
        }
         
        reverseStr = reverseStr + reverseWord + " ";
    }
     
    System.out.println("Given Sentence : " + input);
     
    System.out.println("Reversing each word : " + reverseStr);
}
 
	public static void main(String[] args) {
	    revWordsinSenten("hi every one");

	}

}
