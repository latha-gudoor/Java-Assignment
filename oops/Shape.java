/* Write a program that creates a class Circle extending Shape abstract class and
 *  implementing ShapeConstants interface and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents.*/


package com.wbl.oops;

public abstract class Shape {

	float radius;
	int a,b;
	
	/*public Shape(int a,int b){
		this.a=a;
		this.b=b;*/
	// constructor for number of sides
	public Shape(int sides){
		System.out.println("sides of shape : " + sides);
		System.out.println("parent constructor");
	}
	


public abstract double areaOfEllipse(float a,float b);

	public abstract double areaOfCircle(float radius);
	}

