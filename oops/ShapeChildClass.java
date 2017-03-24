package com.wbl.oops;


//child class inheriting parent AbstratClassShape 
public class ShapeChildClass extends AbstratClassShape {

	
	
	public float calculateArea(int a) {
		System.out.println("square area: ");
		area = a*a;
		return area;
	}

	public float calculatePerimeter(int a) {
		System.out.println("sqaure perimeter");
		perimeter = 4*a;
		return perimeter;
	}
	
	public float calculateArea(int w,int h) {
		System.out.println("Rectangle area: ");
		area = w*h;
		return area;
	}

	public float calculatePerimeter(int w,int h) {
		System.out.println("Rectangle perimeter");
		perimeter = (2*w)+(2*h);
		return perimeter;
	}
	public float calculateArea(int b,float h) {
		System.out.println("Triangle area: ");
		area = (b*h)/2;
		return area;
	}

	public float calculatePerimeter(int a,int b,float c) {
		System.out.println("Triangle perimeter");
		perimeter = a*b*c;
		return perimeter;
	}
	



}