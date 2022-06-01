package com.question1;
import java.util.Scanner;

public class AllStudent {

	public AllStudent() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String nam=sc.nextLine();
		System.out.println("Enter Student Address: ");
;		String add=sc.nextLine();
		System.out.println("Select 1 for science and Select 2 for History");
		int first=sc.nextInt();
		if(first==1) {
			System.out.println("Enter the marks for Physics");
			int phy=sc.nextInt();
			System.out.println("Enter the marks for chemistry");
			int chm=sc.nextInt();
			System.out.println("Enter the marks for maths");
			int ma=sc.nextInt();
			Student scienceStudent=new ScienceStudent(nam,add,phy,chm,ma);
			System.out.println("Your percentage is "+scienceStudent.getPercentage()+"%");
		}else if(first==2) {
			System.out.println("Enter the marks for History");
			int his=sc.nextInt();
			System.out.println("Enter the marks for civics");
			int civ=sc.nextInt();
			Student historyStudent=new HistoryStudent(nam,add,his,civ);
			System.out.println("Your percentage is "+historyStudent.getPercentage()+"%"); 
		}
	}
}
