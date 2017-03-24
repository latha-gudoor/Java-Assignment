package com.wbl.oops;

public class ShapeMainClass {

	public static void main(String[] args) {

		AbstratClassShape square = new ShapeChildClass();
		square.setNoOfSides(4);
		System.out.println("no. of sides : " + square.getNoOfSides());
		System.out.println(square.calculateArea(5));
		System.out.println(square.calculatePerimeter(10));

		ShapeChildClass rectangle = new ShapeChildClass();
		rectangle.setNoOfSides(4);
		System.out.println(rectangle.getNoOfSides());
		System.out.println(rectangle.calculateArea(4, 6));
		System.out.println(rectangle.calculatePerimeter(4, 6));



	}

}
