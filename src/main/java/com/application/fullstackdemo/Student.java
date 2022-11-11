
package com.application.fullstackdemo;

public class Student 
{
	String stdName;
	String stdCourse;
	String stdCity;
	String stdPhone;

	public Student(String Name, String Course, String City, String Phone) 
	{

		this.stdName = Name;
		this.stdCity = City;
		this.stdCourse = Course;
		this.stdPhone = Phone;

	}	
	public String getStdName() 
	{
		return stdName;
	}

	public void setStdName(String stdName) 
	{
		this.stdName = stdName;
	}

	public String getStdCourse() 
	{
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) 
	{
		this.stdCourse = stdCourse;
	}

	public String getStdCity() 
	{
		return stdCity;
	}

	public void setStdCity(String stdCity) 
	{
		this.stdCity = stdCity;
	}

	public String getStdPhone() 
	{
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) 
	{
		this.stdPhone = stdPhone;
	}
	public void displayStdDetails() 
	{
		System.out.println(this.stdName);
		System.out.println(this.stdCourse);
		System.out.println(this.stdCity);
		System.out.println(this.stdPhone);

	}
	public static void main(String[] args) 
	{
	
	Student std = new Student("Girish","Java","Hyd","9988998899");

	std.displayStdDetails();
	
	std.setStdName("Keerthi");
	
	String city = std.getStdCity();
	System.out.println(city);
	
	String Name = std.getStdName();
	System.out.println(Name);

	std.displayStdDetails();
	}
}
