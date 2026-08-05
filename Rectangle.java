package com.codewithharry.shape;

public class Rectangle{
	private int length=0;
	private int width=0;

	public void setLength(int l){
		this.length=l;	
	}

	public void setWidth(int w){
		this.width=w;
	}

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	public int area(int L, int W){
		int area = L*W;
		return area;
	}

	public int perimeter(int l, int w){
		int perimeter = 2*(l+w);
		return perimeter;
	}

	public static void main(String[] a){}
}
		