package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		try {
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			try {
				int num2 = sc.nextInt();
				String msg = null;
				try {
					int num3 = num1 / num2;
					if (num3 > 10) {
						msg = "Welcome to Exception Handling ";
					}
					try {
						System.out.println("Message is " + msg.toUpperCase());
					} catch (Exception e) {
						System.out.println("String Is Null");
					}
				} catch (ArithmeticException e) {
					System.out.println("The Num 2 Should not be 0");
				}
			} catch (Exception e) {
				System.out.println("Enter the valid Number");
			}

		} catch (Exception e) {
			System.out.println("Enter the valid Number");
		}

		System.out.println("End of main");
	}

}