//Write a program to depict the behavior of method overloading and overriding.
package com.wbl.oops;

public class OverloadingExample {


	public void StudentInfo(int id,String name,String course){
		System.out.println("stident Id : " +id);
		System.out.println("Student name : " + name);
		System.out.println("Student Course : " + course);
	}
	int a,b;
	//method 1
	public int mathOperations(int a,int b){
		System.out.println("Addition : ");
		return a+b;

	}
	//overloading method1
	public float mathOperations(float a,float b){
		System.out.println("Division : ");
		return a/b;
	}
	//overloading method2
	public float mathOperations(int a,float b){
		System.out.println("Multiplication : ");
		return a*b;
	}


	public static void main(String[] args) {

		OverloadingExample p1= new OverloadingExample();
		System.out.println(p1.mathOperations(5, 10));
		System.out.println(p1.mathOperations(3, 6f));
		System.out.println(p1.mathOperations(15f, 3f));
		p1.StudentInfo(101, "sree", "QA");
		System.out.println("\n");

		//child class object
		OverloadingExample p2 = new Child_Overriding();
		p2.StudentInfo(105, "Reena", "UI");
	}

}
