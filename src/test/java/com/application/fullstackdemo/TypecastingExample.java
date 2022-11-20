package com.application.fullstackdemo;

class Program1 
{
	Program1()
	{
		System.out.println("Method from Program1");
	}
}
class Program2 extends Program1
{
	Program2()
	{
		System.out.println("Method from Program2");
	}
}
class TypecastingExample
{
	public static void main(String args[])
	{
		Program1 p1=new Program1();//Type matching statements
		Program2 p2=new Program2();//Type matching statements
		Program1 p3=new Program2();//Upcasting or widening casting
		Program2 p4=(Program2) new Program1();//Downcasting or Narrowing casting
	}
	
}