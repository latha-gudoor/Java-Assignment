//Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and 
//methods(calculateArea,calculatePerimeter,setSides.

package com.wbl.oops;

//parent abstract class
public abstract  class AbstratClassShape {

	public int noOfSides;
	public float area;
	public float perimeter;
	//concrete methods
	public int getNoOfSides() {
		return noOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	//Abstract methods
	public abstract float calculateArea(int a);
	public abstract float calculatePerimeter(int a);




}
