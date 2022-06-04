package com.question2;
import java.util.Scanner;


public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	String searchOutdatedModel(String companyName,String modelName) {
		boolean s=false;
		for(String item: outdatedModels) {
			if(item.equals(modelName)) {
				System.out.println(item+"_OUTDATED");
				return item;
			}
			if(item!=modelName) {
				s=true;
			}
		}
		if(s) {
			System.out.println("This model phone is not available");
		}
		return "a";
	}
	
	
}
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company Name");
		String cName=sc.next();
		System.out.println("Enter the model Name");
		String mName=sc.next();
		Mobile m=new Mobile();
		String s=m.searchOutdatedModel(cName,mName);
	}
}