package com.application.fullstackdemo;

public class Student {

	// Attributes
	String stdName;
	String stdCourse;
	String stdCity;
	String stdPhone;

	// Constructor
	public Student(String Name, String Course, String City, String Phone) {

		this.stdName = Name;
		this.stdCity = City;
		this.stdCourse = Course;
		this.stdPhone = Phone;

	}

	// Getters and Setters
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	// setvalue and getvalue
	// set Student Name
	// get Student Name

	// Method
	
	public void displayStdDetails() {
		System.out.println(this.stdName);
		System.out.println(this.stdCourse);
		System.out.println(this.stdCity);
		System.out.println(this.stdPhone);

	}

	public static void main(String[] args)
	{
		Student std = new Student("Sarada","Java","Guntur","4569");
		std.displayStdDetails();
	}
}
