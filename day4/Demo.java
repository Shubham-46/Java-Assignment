package com.day4;

public class Demo {
	public Demo(){
		System.out.println("This is constructor one() ");
	}
	public Demo(int i){
		System.out.println("This is constructor two "+i);
	}
	public Demo(float f){
		System.out.println("This is constructor three "+f);
	}
	public Demo(String s){
		System.out.println("This is constructor four "+s);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1=new Demo(10);
		d1=new Demo(12.0f);
		d1=new Demo("hello");
		
	}
}
