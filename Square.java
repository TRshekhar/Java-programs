package com.codewithharry.shape;

public class Square{
	private int side=0;

	public void setSide(int s){
		this.side=s;
	}

	public int getSide(){
		return side;
	}

	public int area(int s){
		return s*s;
	}

	public int perimeter(int s){
		return 4*s;
	}
	
	public static void main(String[] a){}
}

	
	