package Oops_;

// • We have to calculate the percentage of marks obtained in three subjects (each out of 
//   100) by student A and in four subjects (each out of 100) by student B. Create an 
//   abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
//   other classes 'A' and 'B' each having a method with the same name which returns the 
//   percentage of the students. The constructor of student A takes the marks in three 
//   subjects as its parameters and the marks in foursubjects as its parameters forstudent
//   B. Create an object for each of the two classes and print the percentage of marks for 
//   both the students.

abstract class marks
{
	abstract double
	getpercentage();	
}
 class A extends marks
{
	int sub1, sub2, sub3;
	A(int s1,int s2, int s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;		
	}
	double getpercentage()
	{
		return(sub1+sub2+sub3)/3.0;
	}
}
 class  a1 extends  marks
{
	int sub1, sub2, sub3, sub4;
	a1(int s1,int s2,int s3,int s4)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
	}
	public a1(int i, int j, double d) {
		// TODO Auto-generated constructor stub
	}
	double getpercentange()
	{
		return(sub1+sub2+sub3+sub4)/4.0;
	}
	@Override
	double getpercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Oops_Q_009
{
	public static void main(String[] args)
	{
		A studentA = new A (80,78,50);
		a1 studentA1 = new a1 (90,78,89.98);
		
		System.out.println("percentage of student A..."+studentA.getpercentage()+"%");
		System.out.println("percentage of student B..."+studentA1.getpercentage()+"%");	
	}
}