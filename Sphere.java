package com.codewithharry.shape;
public class Sphere extends Circle{

	public double volume(double r){
		return (4*Math.PI*r*r*r)/3;
	}

	public double Surface_area(double r){
		return 4*Math.PI*r*r;
	}
	
	public static void main(String[] a){}
}