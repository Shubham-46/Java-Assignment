package com.question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleRead {

	public static void main(String[] args) throws IOException {
		Path p=Paths.get("C:\\myjava\\Dummy.txt");
		
		List<String> list=Files.readAllLines(p);
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
	}
}
