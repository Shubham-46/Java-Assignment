package com.day3;

public class VowelandConsonant {
	String s="#";
	public static void main(String[] args) {
		VowelandConsonant d1=new VowelandConsonant();
		if(d1.s=="a" || d1.s=="e" || d1.s=="i" || d1.s=="o" || d1.s=="u"
			|| d1.s=="A" || d1.s=="E" || d1.s=="I" || d1.s=="O" || d1.s=="U") {
			System.out.println("Vowel");
		}else if(d1.s=="#" || d1.s=="@" || d1.s=="$" || d1.s=="&"){
			System.out.println("Invalid character");
		}else {
			System.out.println("Consonant");
		}
	}
}
