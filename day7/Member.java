package com.day7;

public class Member {
	String name;
	int age;
	String phoneNo;
	String add;
	double salary;
	
	void printSalary(double salary) {
		System.out.println("salary "+salary);
	}
}
	class Employee extends Member{
		String specialization;
		String department;
		
	}
	class Manager extends Member{
		String specialization;
		String department;
	}
	
	class Main{
		public static void main(String[] args) {
			Employee e=new Employee();
			e.name="Shubham";
			e.age=19;
			e.phoneNo="123456";
			e.add="1";
			e.specialization="Software engineer";
			e.department="IT";
			System.out.println("Emp name is "+e.name);
			System.out.println("Emp age is "+e.age);
			System.out.println("Emp phoneno is "+e.phoneNo);
			System.out.println("Emp add is "+e.add);
			e.printSalary(10000);
			System.out.println("Emp specialization is "+e.specialization);
			System.out.println("Emp department is "+e.department);
			
			System.out.println("========================");
			
			Manager m=new Manager();
			m.name="Vijay";
			m.age=29;
			m.phoneNo="12345678";
			m.add="2";
			m.specialization="TeamLead";
			m.department="IT";
			System.out.println("Mng name is "+m.name);
			System.out.println("Mng age is "+m.age);
			System.out.println("Mng phoneno is "+m.phoneNo);
			System.out.println("Mng add is "+m.add);
			m.printSalary(100000);
			System.out.println("Mng specialization is "+m.specialization);
			System.out.println("Mng department is "+m.department);
			
		}
	}

