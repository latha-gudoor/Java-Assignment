//Hashcode and Equal Override
package com.wbl.Strings;

public class UserDefinedObjectClass {

	public String empName;
	public int id;
	public int salary;
	public String desig;
	
	public UserDefinedObjectClass(String empName,int id,int salary,String desig){
		this.empName=empName;
		this.id=id;
		this.salary=salary;
		this.desig=desig;
	}
	
	@Override
	public int hashCode(){
		return id*10;
		
	}
	@Override
	public boolean equals(Object ob){
		boolean isEqual=false;
		if ((ob instanceof UserDefinedObjectClass && ((UserDefinedObjectClass)ob).id==this.id && ((UserDefinedObjectClass)ob).empName == this.empName
		&& ((UserDefinedObjectClass)ob).salary == this.salary 
		&& ((UserDefinedObjectClass)ob).desig==this.desig)){
			isEqual=true;
				}
		return isEqual;

	}
	
	}
