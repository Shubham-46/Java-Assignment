package com.question2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File fi=new File("C:\\myjava\\Dummy.txt");
		
		FileReader fr=new FileReader(fi);
		
		int i;
		while ((i=fr.read()) != -1) 
			 System.out.print((char) i); 
		} 
	}

