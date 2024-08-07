package Oops_;

// • Print the sum, difference and product of two complex numbers by creating a class 
//   named 'Complex' with separate methods for each operation whose real and 
//   imaginary parts are entered by user. 


import java.util.Scanner;

class complex
{
	int real1,real2,imaginary1,imaginary2;
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		real1 = sc.nextInt();
		System.out.println("enter the real part of the second complex number...");
		
		real2 = sc.nextInt();
		System.out.println("Enter the imaginary part of the second complex number...");
		imaginary2=sc.nextInt();
	}
	public void sum()
	{
		System.out.println("sum of the complex numbers..."+(real1+real2)+"+"+(imaginary1+imaginary2)+"i");
	}
	public void difference()
	{
		System.out.println("difference of the complex number..."+(real1-real2)+"+"+(imaginary1-imaginary2)+"i");
		
	}
	public void product()
	{
		int realpart=(real1*real2)-(imaginary1*imaginary2);
		int imaginarypart=(real1*imaginary2)+(real2*imaginary1);
		System.out.println("product of the complex number..."+realpart+"+"+"i");
	}
}
public class Oops_Q_006
{
	public static void main(String[] args)
	{ 
		complex c1 = new complex();
		c1.input();
		c1.sum();
		c1.product();
	}
}
