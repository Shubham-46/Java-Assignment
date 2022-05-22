package com.day4;

public class WholeNumber {
	public static void main(String[] args) {
		int n=45;
		int rem;
		rem=n%10;
		if(n%2==0) {
			n=n+(10-rem);
			System.out.println("result is "+n);
		}
		else if(n%2==1){
			System.out.println("result is "+n);
		}else if(n<0) {
			System.out.println("Error ");
		}
	}
}
