package com.application.fullstackdemo;

public class employee {

	// Attributes
	String empName;
	String empDesignation;
	String empId;
	String empPhone;
	String empSalary;
	// Constructor
	public employee(String Name, String Designation, String Id, String Phone,String Salary) {

		this.empName=Name;
		this.empDesignation=Designation;
		this.empId=Id;
		this.empPhone=Phone;
		this.empSalary=Salary;

	}

	// Getters and Setters
	
	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getStdCourse() {
		return empDesignation;
	}

	public void setempDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getempID() {
		return empId;
	}

	public void setempId(String empId) {
		this.empId = empId;
	}

	public String getempPhone() {
		return empPhone;
	}

	public void setempPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public void setempSalary(String empSalary ) {
		this.empSalary = empSalary;
	}

	// setvalue and getvalue
	// set Student Name
	// get Student Name

	// Method
	
	public void displayemployeeDetails() {
		System.out.println(this.empName);
		System.out.println(this.empDesignation);
		System.out.println(this.empId);
		System.out.println(this.empPhone);
		System.out.println(this.empSalary);

	}
	public static void main(String args[])
	{
		employee e1=new employee("manaswi","fullstack","25","12345678","25000");
		e1.displayemployeeDetails();
		
	}
		
	}