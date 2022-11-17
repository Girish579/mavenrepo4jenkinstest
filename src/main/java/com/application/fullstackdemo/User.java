package com.application.fullstackdemo;

interface Account
{
public abstract void withdraw(double amt);
public abstract void deposit(double amt);
public abstract void checkbal();
}
class Savingsacc implements Account
{
int accno;
String accname;
double bal;
Savingsacc(int accno,String accname,double bal)
{
this.accno=accno;
this.accname=accname;
this.bal=bal;
}
public void withdraw(double amt)
{
if(bal>=amt)
{
bal=bal-amt;
System.out.println("withdrawn amount="+amt);
}
else
{
System.out.println("Go deposit money first");
}
}
public void deposit(double amt)
{
bal=bal+amt;
System.out.println("Deposited amount="+amt);
}
public void checkbal()
{
System.out.println("balance="+bal);
}
}
class Accmanager
{
public static Account createacc(int accno,String accname,double bal,String type)
{
if(type=="savings")
{
return new Savingsacc(accno,accname,bal);
}
else
{
	return null;
}
}
}
class User
{
public static void main(String args[])
{
Account a1=Accmanager.createacc(1234,"abc",20000.00,"savings"); //we can create reference variable for interface but we can't create object for interface
System.out.println("For savings account");
a1.checkbal();
a1.withdraw(5000);
a1.checkbal();
a1.deposit(6000);
a1.checkbal();
}
}
    
