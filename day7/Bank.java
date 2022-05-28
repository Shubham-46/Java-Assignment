package com.day7;
import java.util.Scanner;
public class Bank {
	
	String branchName; 
	String IfscCode; 

	void displayDetails() {
		System.out.println("Branch name is: "+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
	}
}

class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("Rate of intrest is: "+rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class IciciBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("Rate of intrest is: "+rateOfInterest);
	}
}


class Demo{
	public static Bank getBank(String bank) {
		if(bank=="axis") {
			AxisBank a=new AxisBank();
			a.branchName="Axis Bank";
			a.IfscCode="000AXIS123";
			a.rateOfInterest=10;
			a.getCreditCard();
			return a;
		}else if(bank=="icici") {
			IciciBank i=new IciciBank();
			i.branchName="Icici bank";
			i.IfscCode="000ICICI123";
			i.rateOfInterest=7;
			return i;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Bank a=d.getBank("icici");
		a.displayDetails();
	}
}
