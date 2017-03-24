// Reversing complete sentence 

package com.wbl.Strings;

public class ReverseSentence {

	public void revesingEachWord(String sentence){
		
		System.out.println("length : " + sentence.length());
	char [] word = new char[sentence.length()];
	int j=0;

	for(int i=sentence.length()-1;i>=0;i--){
		word[j]= sentence.charAt(i);
		j++;
		
	}
		String revword= new String(word);
		System.out.println("Given Sentence : " + sentence);
		System.out.println(" Revesing each word and whole sentence : " + revword);
	}
	
	public void reverseWords(){
		
	}
	public static void main(String[] args) {

		ReverseSentence str = new ReverseSentence();
		str.revesingEachWord("welcome everyone hello");
	}

}
