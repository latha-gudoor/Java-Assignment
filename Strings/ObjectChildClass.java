//Childclass inheriting parent class
package com.wbl.Strings;

public class ObjectChildClass extends ObjectClassMethods {

	public ObjectChildClass(String string, int i) {
		super(string,i);
	}
@Override
	public String toString(){
		System.out.println("String mehod is overidden in child class");
		return name;
	}
@Override
	public int hashCode(){
		return 10*id;
	}

}
