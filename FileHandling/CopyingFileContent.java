//Write a program to copy content of file into another file.


package com.wbl.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingFileContent {

	public static void main(String[] args) throws IOException {

		//opens the source file for reading 
		FileReader source = new FileReader("C:\\Users\\arien213\\Desktop\\sample.txt");
		
		//open the destination file for writing
		FileWriter destination = new FileWriter("C:\\Users\\arien213\\Desktop\\destfile.txt");
		
		//file reader opens the file in read mode and bufferedreader reads the data
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(destination);

		
		String line = br.readLine();
		while(line != null){
		bw.write(line);
		}
		bw.close();
		br.close();
		source.close();
		destination.close();
		}	
	}
