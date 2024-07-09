package assigment;

import java.util.Scanner;

//• Write a program in Java to input 5 numbers from keyboard and find their sum and 
//  average using for loop.


public class basic4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int sum =0;
		int n = 5;
		
		System.out.println("Enter... "+n+"numbers...");
		
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			sum +=num;
		}
		double average = sum /(double)n;
		
		System.out.println("sum..."+sum);
		System.out.println("average..."+average);
	}
}	
	


