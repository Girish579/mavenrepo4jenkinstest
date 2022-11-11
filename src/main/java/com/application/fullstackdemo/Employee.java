package com.application.fullstackdemo;

public class Employee 
{
	String EmpName;
	double EmpSal;
	String EmpDes;
	int EmpId;
	String EmpPhone;
	String EmpAddress;
	
	public Employee(String Name, double Sal, String Des, int Id, String Phone, String Address) 
	{

		this.EmpName = Name;
		this.EmpSal = Sal;
		this.EmpDes = Des;
		this.EmpId = Id;
		this.EmpPhone = Phone;
		this.EmpAddress = Address;
	}
	
	public String getEmpName() 
	{
		return EmpName;
	}

	public void setEmpName(String EmpName) 
	{
		this.EmpName = EmpName;
	}

	public double getEmpSal() 
	{
		return EmpSal;
	}

	public void setEmpSal(double EmpSal) 
	{
		this.EmpSal = EmpSal;
	}

	public String getEmpDes() 
	{
		return EmpDes;
	}

	public void setEmpDes(String EmpDes) 
	{
		this.EmpDes = EmpDes;
	}

	public int getEmpId() 
	{
		return EmpId;
	}
	public void setEmpId(int EmpId) 
	{
		this.EmpId = EmpId;
	}
	public String getEmpPhone() 
	{
		return EmpPhone;
	}
	public void setEmpPhone(String EmpPhone) 
	{
		this.EmpPhone = EmpPhone;
	}
	public String getEmpAddress() 
	{
		return EmpAddress;
	}
	public void setEmpAddress(String EmpAddress) 
	{
		this.EmpAddress = EmpAddress;
	}
	public void displayEmpDetails() 
	{
		System.out.println(this.EmpName);
		System.out.println(this.EmpSal);
		System.out.println(this.EmpDes);
		System.out.println(this.EmpId);
		System.out.println(this.EmpPhone);
		System.out.println(this.EmpAddress);
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Girish",35000.00,"Sr.Developer",123,"9988998899","8/5/3, Hyderabad, Sangareddy");
		emp.displayEmpDetails();
		
		System.out.print("\n");
		emp.setEmpName("Keerthi");
		emp.setEmpSal(30000.00);
		emp.setEmpDes("Jr.Developer");
		emp.setEmpId(456);
		emp.setEmpPhone("9876543210");
		emp.setEmpAddress("h-no 8/87, j.p.colony, hyderabad.");
		
		String name = emp.getEmpName();
		System.out.println(name);
		
		double Sal = emp.getEmpSal();
		System.out.println(Sal);
		
		String Des = emp.getEmpDes();
		System.out.println(Des);
		
		int Id = emp.getEmpId();
		System.out.println(Id);
		
		String Phone = emp.getEmpPhone();
		System.out.println(Phone);
		
		String Address = emp.getEmpAddress();
		System.out.println(Address);
		
	}
}