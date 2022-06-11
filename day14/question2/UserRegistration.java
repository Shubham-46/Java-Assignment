package com.question2;
import java.util.Scanner;

public class UserRegistration {

	void registerUser(String username,String userCountry)throws InvalidCountryException {
		if(userCountry.equalsIgnoreCase("India")) {
			InvalidCountryException ie=new InvalidCountryException("User Outside India cannot be register");
			throw ie;
		}else {
			System.out.println("User registration done successfully");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the country name");
		String cName=sc.next();
		UserRegistration r=new UserRegistration();
		
	}
	
}
class InvalidCountryException extends Exception{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}
