//Write a program to depict the behavior of method overloading and overriding.
package com.wbl.oops;

public class Child_Overriding extends OverloadingExample {

	@Override
	public void StudentInfo(int id,String name,String course){
		System.out.println("Child Class student Id : " +id);
		System.out.println("Child Class Student name : " + name);
		System.out.println("Child Class Student Course : " + course);
		System.out.println("Class loction is Fremont");
	}
}
