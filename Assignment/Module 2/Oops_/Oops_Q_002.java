package Oops_;

// • Create a class with a method that prints "This is a parent class" and its subclass with 
//   another method that prints "This is child class". Now, create an object for each of 
//   the class and call 1 - method of parent class by object of parent class 2 - method of 
//   child class by object of child class 3 - method of parent class by object of child class



class family
{
	String parentname;
	public void parent()
	{
		parentname="bharatbhai lalakiya...";
		System.out.println("This is a parents class...");
	}
}
class child extends family
{
	String childname;
	public void child()
	{
		childname="riya lalakiya...";
		System.out.println("this is a child class...");
	}
}

public class Oops_Q_002 
{
	public static void main(String[] args)
	{
		family f1= new family();
		child c1 = new child();
		f1.parent();
		c1.child();	
	}
}
