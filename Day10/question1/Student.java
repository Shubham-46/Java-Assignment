package com.question1;

public abstract class Student {
	String name;
	String address;

	abstract float getPercentage();
	
	public Student (String name,String address){
		this.name=name;
		this.address=address;
	}
}
class ScienceStudent extends Student{
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
		
	public ScienceStudent(String name,String address,int physicsMarks,int chemistryMarks,int mathsMarks){
		super(name,address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	 
	@Override
	float getPercentage() {
		return (this.chemistryMarks+this.mathsMarks+this.physicsMarks)/3;
	}
}
class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name,String address,int historyMarks,int civicsMarks){
		super(name,address);
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
		
	}
	
	@Override
	float getPercentage() {
		return (this.historyMarks+this.civicsMarks)/2;
	}
}

