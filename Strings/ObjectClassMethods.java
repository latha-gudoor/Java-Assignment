//Main class for hashcode and equas method program
package com.wbl.Strings;

public class ObjectClassMethods {

	String name;
	int id;
	
	public ObjectClassMethods(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public void displayDetails(){
		System.out.println("Student name is : " + name);
		System.out.println("Studenet number is : " + id);
		System.out.println(name.hashCode());
	}
	
	public static void main(String[] args) {

		ObjectClassMethods st = new ObjectClassMethods("sree",101);
		ObjectChildClass st1 = new ObjectChildClass("hari",102);
		System.out.println(st1.toString());
		System.out.println(st.toString());
		st1.displayDetails();
		st.displayDetails();
	}

}
