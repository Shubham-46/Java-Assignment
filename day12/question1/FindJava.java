package com.question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindJava{

	public static void main(String[] args) {
	System.out.println("Please Enter A Paragraph to search");
	Scanner sc=new Scanner(System.in);
	String paraString=sc.nextLine();
	sc.nextLine();
	Pattern pattern=Pattern.compile("Java");
	Matcher matcher=pattern.matcher(paraString);
	int count=0;
	while(matcher.find()) {
		count++;
	System.out.println(matcher.start() + "----" + matcher.end() + "==" + matcher.group());
	}
	System.out.println("Count of the Word java is:" + count);
	}
}