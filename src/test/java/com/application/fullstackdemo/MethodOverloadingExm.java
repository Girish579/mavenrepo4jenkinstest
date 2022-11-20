package com.application.fullstackdemo;

class Demo1
{
	public void disp()
	{
		System.out.println("Method from Demo1");
	}
}
class Demo2 extends Demo1
{
	public void disp(int a)
	{
		System.out.println("Method from Demo2");
	}
}
class MethodOverloadingExm
{
	public static void main(String args[])
	{
		Demo2 d2=new Demo2(); 
		d2.disp();
		d2.disp(25);
	}
}