
// Write a program to count the number of words in a file.

package com.wbl.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCountFromFile {

	public static void main(String[] args) throws IOException {
		System.out.println ("Counting Words");       
		FileReader fr = new FileReader ("C:\\Users\\arien213\\Desktop\\aa.txt");        
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader (fr);     
		String line = br.readLine();
		int count = 0;
		while (line != null) {
			String[] words = line.split(" ");
			for( String w : words)
			{
				count++; 
				System.out.println(w);
			}
			line = br.readLine();
		}         
		System.out.println("total words in File are : " +  count);
	}



}

