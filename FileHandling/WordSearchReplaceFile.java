
// Write a program to search for a string in a file and then replace it with another string.

package com.wbl.FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearchReplaceFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("C:\\Users\\arien213\\Desktop\\aa.txt");
		BufferedInputStream buffer = new BufferedInputStream(in);

		Scanner scan = new Scanner(buffer);
		String str = scan.nextLine();

		String rep = str.replaceAll("java", "C++");
		System.out.println("the string before replace: " + str);
		System.out.println("the string after replace: "+ rep);
		scan.close();
	}

}
