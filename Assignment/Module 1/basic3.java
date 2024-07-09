package assigment;

import java.util.Scanner;
//• Write a Java program that takes a year from user and print whether that year is a leap 
//  year or not. B19.

public class basic3
{
	public static void main(String[] args) 
	{
		int y;
		System.out.println("Enter Any Year,,,");
		
		Scanner a = new Scanner(System.in);
		y =  a.nextInt();
		
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%400==0 )
		{
			System.out.println("Leap Year....");
		
		}

		else
		{
			System.out.println("Not Leap Year...");
			
		}
		
		
		
	}

}
