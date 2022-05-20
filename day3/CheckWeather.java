package com.day3;

public class CheckWeather {
	public static void main(String[] args) {
		boolean isSnowing=false;
		boolean isRaining=true;
		double temperature=60.0;
		double degree=50.0;
		if(!isSnowing || !isRaining || temperature<degree) {
			System.out.println("Let's stay home");
		}else {
			System.out.println("Let's go out!");
		}
	}
}
