package com.day3;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentdetails() {
		System.out.println("roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Marks is "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.roll=23;
		s1.name="Shubham";
		s1.marks=99;
		s1.displayStudentdetails();
		Student s2=new Student();
		s2=s1;
		s1=null;
		s2=null;
		
	}
}