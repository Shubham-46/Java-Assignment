package com.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadContent {

	public static void main(String[] args)throws Exception {
		File fi=new File("C:\\myjava\\Dummy.txt");
		BufferedReader bf=new BufferedReader(new FileReader(fi));
		
		String st;
		while((st=bf.readLine())!=null){
			System.out.println(st);
		}
	}
}

