package com.reynold.writing;

public class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
		
		
	////	void detail(){
	//	System.out.println(this.id + " " + this.name);
	//}
	
	
	Student()
	{
		this.id = 100;
		this.name = "Dummy";
		System.out.println(this.id + " " + this.name );
		
	}

	public static void main(String[] args) {

		Student s = new Student(3, "Ramesh");
		//s.detail();
		Student s2 = new Student();
		
		Student s3 = new Student(5, "monika");

	}

}
