package com.day6;
import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String st=sc.nextLine();
		String s=st;
		String bag="";
		System.out.println("Word is "+s);
		reversestring(s,bag);
	}
	public static void reversestring(String s,String bag) {
		for(int i=s.length()-1;i>=0;i--) {
			bag+=s.charAt(i);
		}
		System.out.println("Reversed word is "+bag);
	}

}
