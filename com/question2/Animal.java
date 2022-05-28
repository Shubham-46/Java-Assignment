package com.question2;

public class Animal {

	public void makeNoise(){
		System.out.println("Animal making Noise");
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void walk(){
		System.out.println("Animal is walking");
	}
}
class Dog extends Animal{
	public void makeNoise(){
		System.out.println("Dog Barking");
	}
	public void eat(){
		System.out.println("Dog is eating");
	}
	public void walk(){
		System.out.println("Dog is walking");
	}
	
}
class Cat extends Animal{
	public void makeNoise(){
		System.out.println("Cat Meow");
	}
	public void eat(){
		System.out.println("Cat is eating");
	}
	public void walk(){
		System.out.println("Cat is walking");
	}
}
class Tiger extends Animal{
	public void makeNoise(){
		System.out.println("Tiger  Roarrr");
	}
	public void eat(){
		System.out.println("Tiger is eating");
	}
	public void walk(){
		System.out.println("Tiger is walking");
	}
}

class Main{
	public static void main(String[] args){
		Animal[] arr=new Animal[3];
		Dog d=new Dog();
		Cat c=new Cat();
		Tiger t=new Tiger();
		arr[0]=d;
		arr[1]=c;
		arr[2]=t;
		for(int i=0;i<arr.length;i++) {
			arr[i].makeNoise();
			arr[i].eat();
			arr[i].walk();
		}
		
	}
}
