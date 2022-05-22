package com.day5;
import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void setId(int employeeId) {
	    this.employeeId = employeeId;
	}
	
	  // initialize name
	public void setName(String employeeName) {
	    this.employeeName = employeeName;
        
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setnetSalary(double netSalary) {
		this.netSalary=netSalary;
	}
	
	public int getId() {
	    return this.employeeId;
	}

	  // access name
	public String getName() {
	    return this.employeeName;
	}
	
	public double getsalary(){
		return this.salary;
	}
	
	public double getnetSalary() {
		return this.netSalary;
	}
	
	public static double getPFPercentage() {
		double a=7;
		return a;
	}
	public void calculateNetSalary(double pfpercentage) {
		double salary=getsalary();
		double s=pfpercentage*(salary/100);
		double netSalary=Math.abs(salary-s);
		setnetSalary(netSalary);
	}
	public void EmployeeDetails() {
		System.out.println("Emp Id "+employeeId);
		System.out.println("Emp name "+employeeName);
		System.out.println("Emp salary "+salary);
		System.out.println("Emp netSalary "+netSalary);
	}
	
}


class Main {
	
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Id");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your name");
    String s=sc.nextLine();
    System.out.println("Enter your salary");
    double sal=sc.nextDouble();
    System.out.println("Enter your pf Percentage");
    double pf=sc.nextDouble();
    Employee e1 = new Employee();
    // set value of private variables
    e1.setId(id);
    e1.setName(s);
    e1.setSalary(sal);
    double a=e1.getPFPercentage();
    e1.calculateNetSalary(a);
    e1.EmployeeDetails();
//    System.out.println("Net Salary "+e1.getId());
  	}
}