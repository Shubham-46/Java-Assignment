package com.question2;

public class Area extends Shape{
	
	@Override
	public int rectangleArea(int length, int breadth) {
		int total=length*breadth;
		return total;
	}
	
	@Override
	public int squareArea(int side) {
		int total=side*side;
		return total;
	}
	
	@Override
	public double circleArea(double radius) {
		double total=2*(3.14*radius);
		return total;
	}
}

class Main{
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println("Area of rectangle "+a.rectangleArea(15,15));
		System.out.println("Area of square "+a.squareArea(15));
		System.out.println("Area of circle "+a.circleArea(15));
	}
}