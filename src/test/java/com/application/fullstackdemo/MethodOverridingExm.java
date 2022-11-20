package com.application.fullstackdemo;

class GmailVer1
{
	public void compose()
	{
		System.out.println("FullScreen is for compose");
	}
}
class GmailVer2 extends GmailVer1
{
	public void compose()
	{
		System.out.println("PopupScreen is for compose");
	}
}
class MethodOverridingExm
{
	public static void main(String args[])
	{
		GmailVer1 v1= new GmailVer1();
		GmailVer2 v2= new GmailVer2();
		v1.compose();
		v2.compose();
	}
}