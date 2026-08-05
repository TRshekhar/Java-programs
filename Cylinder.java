package com.codewithharry.shape;
public class Cylinder extends Circle{
	private double height=0;
	
	public void setheight(double h){
		this.height=h;
	}

	public void setDimensions(double r, double h){
		setradius(r);
		setheight(h);
	}

	public double getheight(){
		return this.height;
	}

	public double volume(double r, double h){
		double ar = area(r);
		return ar*h;
	}

	public double surface_area(double r, double h){
		double peri = perimeter(r);
		return 2*peri*h;
	}

	public static void main(String[] a){}
}