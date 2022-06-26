package com.question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Address implements Serializable{
	private String state;
	private String city;
	private String pincode;
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setPincode(String pincode) {
		this.pincode=pincode;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		
	}

	
	
}
class Student implements Serializable{
	private int roll;
	private String name;
    Address address;
	private String StudentAdd;
	private transient String password;
	
	
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentAdd() {
		return StudentAdd;
	}

	public void setStudentAdd(String studentAdd) {
		StudentAdd = studentAdd;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", StudentAdd=" + StudentAdd
				+ ", password=" + password + "]";
	}

	public Student(int roll, String name, Address address, String studentAdd, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		StudentAdd = studentAdd;
		this.password = password;
	}

	public Student() {
		
	}
}
class Main{
	public static void main(String[] args) {
		Address a=new Address("Maharashtra", "Nall", "402506");
		Student s=new Student(101,"shubham", a,"shubham4606@gmail.com","1234");
		
		try {
			FileOutputStream fos = new FileOutputStream("E:\\FSWD\\file1.txt");
			try {
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(s);
				oos.close();
				System.out.println("List is Serialized");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

