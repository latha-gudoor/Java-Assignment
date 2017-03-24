/**--> Console: Use this class to input 2 integer numbers and divide them.

 i tried this in various different options but i am getting 
 Null Pointer Exception as the result
 */


package com.wbl.FileHandling;

import java.io.Console;

public class ConsoleProgram {

	public static void main(String[] args) {
		String first = null;
		String second = null;
		Console console = System.console();
		System.out.println("Enter first number");
		try{
			first=console.readLine();
		
		System.out.println("Enter Second number");
		second=console.readLine();
		}catch(NullPointerException np){
			np.getMessage();
		}finally{
		System.out.println(Integer.parseInt(first)/Integer.parseInt(second));
	}
	}
}
