package com.day4;

public class JavaBean {
	
//	this all are instance variable
	String name;
	int rollno;
	int age;
	int marks;
	
//	this is zero argument constructor and this is the constructor
	public JavaBean() {
		name="shubham";
		rollno=23;
		age=19;
		marks=56;
	}
	
//	this is  parameterized constructor
	public JavaBean(String name,int rollno,int age,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.marks=marks;
	}
	
//	doing encapsulation here 
	public void details() {
		if(age>18 || marks>30) {
			System.out.println("Your name is "+name);
			System.out.println("Your rollno is "+rollno);
			System.out.println("Your age is "+age);
			System.out.println("Your marks is "+marks);
		}else {
			System.out.println("Low age and marks");
		}
	}

	
}
// separate class 
class Jbeans {
	public static void main(String[] args) {
		JavaBean j1=new JavaBean();
		j1.details();
		JavaBean j2=new JavaBean("shubham",23,19,35);
		j2.details();
	}
}

