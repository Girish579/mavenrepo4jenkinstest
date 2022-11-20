package com.application.fullstackdemo;

class MessagingApp
{
	public void msg()
	{
		System.out.println("Message using messaging app");
	}
}
class Whatsapp extends MessagingApp
{
	public void msg()
	{
		System.out.println("Message using Whatsapp app");
	}
}
class Instagram extends MessagingApp
{
	public void msg()
	{
		System.out.println("Message using Instagram app");
	}
}
class Facebook extends MessagingApp
{
	public void msg()
	{
		System.out.println("Message using Facebook messenger app");
	}
}
class Snapchat extends MessagingApp
{
	public void msg()
	{
		System.out.println("Message using Snapchat app");
	}
}
class Person
{
	public void sendmsg(MessagingApp m1)
	{
		m1.msg();
	}
}
class PolymorphismExm
{
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.sendmsg(new MessagingApp());
		p1.sendmsg(new Whatsapp());
		p1.sendmsg(new Instagram());
		p1.sendmsg(new Facebook());
		p1.sendmsg(new Snapchat());
	}
}