package com.amazon.buylaptop;

import java.util.Scanner;

public class Employee {
	
	String name;
	int age;
	String department;
	String address;
	String empId;
	double Salary;
	
	void show()
	{
		System.out.println(this.name+" "+this.address+ " "+this.age+ " "+this.department +" "+this.Salary+ " "+this.empId);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		s.nextLine();
		System.out.println("Enter employee age");
		e.age = s.nextInt();
		s.nextLine();
		System.out.println("Enter the address");
		e.department = s.nextLine();
		System.out.println("Enter the employee id");
		e.empId = s.next();
		System.out.println("Enter the salary");
		e.Salary = s.nextDouble();
		System.out.println("Enter the departmant");
		e.department = s.next();
		e.show();
		
	}

}
