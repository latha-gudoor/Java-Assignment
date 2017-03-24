package com.wbl.oops;

public class Circle extends Shape implements IShapeConstants  {

	// Constructor
	public Circle(int sides) {
		super(sides);
		System.out.println("circle doesnt have any sides");
	}

	double area;

	public double areaOfCircle(float radius) {
		//float radius=5;
		area= (IShapeConstants.PI)*(radius*radius);
		return area;
	}

	public double areaOfEllipse(float a,float b) {
		area= (IShapeConstants.PI)*a*b;
		return area;
	}

	public static void main(String[]args){
		IShapeConstants ellip = new Circle(2);
		System.out.println("Area of Ellipse : " + ellip.areaOfEllipse(4.5f,5f));
		IShapeConstants cir = new Circle(0); 
		System.out.println("Area of Circle : " + cir.areaOfCircle(5.0f));
	}
}