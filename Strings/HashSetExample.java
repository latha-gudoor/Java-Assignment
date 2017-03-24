package com.wbl.Strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public void hashStringSet(){
		// creating hashset-- no duplicate vaues alowed --single null allowed --unordered & unsorted
		Set<String> set1 = new HashSet<String>();
		
		//adding elements to set
		set1.add("cool");
		set1.add("apple");
		set1.add("doll");
		set1.add("cool");
		set1.add(null);
		set1.add("doll");
		set1.add("boy");
		
		//Iteration
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	public void userMethodSet(){
		
		Set<UserDefinedObjectClass> set2 = new HashSet<UserDefinedObjectClass>();
		UserDefinedObjectClass emp1 = new UserDefinedObjectClass("hari",101,12000,"accountant");
		UserDefinedObjectClass emp2 = new UserDefinedObjectClass("henry",106,15000,"clerk");
		UserDefinedObjectClass emp3 = new UserDefinedObjectClass("bhairavi",111,20740,"professor");
		UserDefinedObjectClass emp4 = new UserDefinedObjectClass("akhil",210,45000,"manager");
		UserDefinedObjectClass emp5 = new UserDefinedObjectClass("henry",106,15000,"commisioner");
		UserDefinedObjectClass emp6 = new UserDefinedObjectClass("akhil",210,64500,"Sr.manager");
		UserDefinedObjectClass emp7 = new UserDefinedObjectClass("henry",106,15000,"commisioner");

		set2.add(emp1);
		set2.add(emp2);
		set2.add(emp3);
		set2.add(emp4);
		set2.add(emp5);
		set2.add(emp6);
		set2.add(emp7);
		
		for(UserDefinedObjectClass itr : set2){
			System.out.println(" id : " + itr.id +" Employee Name : " +  itr.empName + " Salary: " + itr.salary + " Designation : " +  itr.desig);
			System.out.println("hashcode : " + itr.hashCode());
		}
		
		System.out.println("Size : " + set2.size());
		}
	public static void main(String[] args) {

		HashSetExample hs = new HashSetExample();
		hs.userMethodSet();
	}

}
