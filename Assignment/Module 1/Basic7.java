package assigment;

import java.util.Scanner;

// Write a Java program that reads a positive integer and count the number of digits
// and by both.

public class Basic7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Integer...");
		int number = sc.nextInt();
		
		int cout = 0;
		int temp = number;
		{
			int count;
			while (temp !=0)
			{
				temp /=10;
				cout++;
			}
			System.out.println("The Number Of Digits In..."+number +"is..."+cout);
		}
	}
}
