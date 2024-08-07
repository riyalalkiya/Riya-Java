package Exception;

/*
 * • Take two numbers from the user and perform the division operation and handle Arithmetic
 *  Exception. O/P- Enter two numbers: 10 0Exception in thread
 *   main java.lang.ArithmeticException:/ by zero.
 */

import java.util.Scanner;

public class Q_002 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers....");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		try
		{
			int result = num1/num2;
			System.out.println("Result of division"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("exception in thread main java.lang.ArithmeticException:/ by zero.\r\n");
		}	
	}
}
