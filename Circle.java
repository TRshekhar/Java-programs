package com.codewithharry.shape;
public class Circle{
	private double radius=0;
	
	public void setradius(double r){
		this.radius=r;
	}

	public double getredius(){
		return radius;
	}

	public double area(double r){
		double area= Math.PI*r*r;
		return area;
	}

	public double perimeter(double r){
		double perimeter = Math.PI*2*r;
		return perimeter;
	}
	
	public double circumference(double r){
		return perimeter(r);
	}

	public static void main(String a[]){}
}
