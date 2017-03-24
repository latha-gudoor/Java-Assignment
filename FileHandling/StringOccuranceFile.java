//Write a program to search for a string in a file and then return the count of number of occurrences of the string.


package com.wbl.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringOccuranceFile {

	public static void main(String[] args) throws IOException {

		File file = new File("java.txt");
		file.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("Data input can be handled in many ways.\n we can use scanner InputStreamReader "
				+ "Datainputstream and console\n for input data.");
		bw.flush();
		bw.close();
		int count=0;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while(line!=null){
			if(line.contains("can")){
				count++;
				System.out.println(line);
			}
			line=br.readLine();
		}
		System.out.println("word 'can' is repeated in file : " + count + " times");
	}

}



