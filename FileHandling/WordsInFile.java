
//word count from file


package com.wbl.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordsInFile {

		public static void main(String[] args) throws FileNotFoundException ,IOException{
		
			String line = ""; 
			String str = "";
			int wordcount = 0;
			int linecount = 0;
			
		FileReader fr = new FileReader("C:\\Users\\arien213\\Desktop\\aa.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
		str = str+line + " ";
		linecount++;
		}
		System.out.println("Number of lines in file : " + linecount);
		 
		System.out.println(str);
		 
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
		@SuppressWarnings("unused")
		String s = st.nextToken();
		wordcount++;
		}
		System.out.println("total words in File are  : " + wordcount);
		br.close();
		}
		 
		}

