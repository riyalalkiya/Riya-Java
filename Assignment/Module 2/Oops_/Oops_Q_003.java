package Oops_;

// • Create a class named 'Member' having the following members:
//   1. Data members
//   2. Name
//   3. Age
//   4. Phone Number
//   5. Address
//   6. Salary

//   It also has a method named 'printSalary' which prints the salary of the members.


class member
{
	int age,salary,datamember;
	String name,address;
	long phonenumber;
	
	public void printsalary()
	{
		age = 21;
		salary = 50000;
		phonenumber = 6351771902l;
		datamember = 10;
		name ="Riyaaa";
		address = "Upleta...";
		
		System.out.println("age is..."+age);		
		System.out.println("salary is..."+salary);
		System.out.println("phonenumber is..."+phonenumber);
		System.out.println("datamember is..."+datamember);
		System.out.println("name is..."+name);
		System.out.println("address is..."+address);
		
	}
}
public class Oops_Q_003
{
	public static void main(String[] args)
	{
		member m1=new member();
		m1.printsalary();
	}
}
