//Write a program to show list of all file names in a folder.

package com.wbl.FileHandling;

import java.io.File;

public class FilesListInFolder {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\arien213\\Desktop\\notes");
		String[] filesList = file.list();
		System.out.println("Files from Folder are : ");
		for(String list:filesList){
			System.out.println(list);

		}

	}
}
