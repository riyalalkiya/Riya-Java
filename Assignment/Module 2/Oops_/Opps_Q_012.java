package Oops_;

//  Write a program which will ask the user to enter his/her marks (out of 100). Define a 
//  method that will display grades according to the marks entered as below:
//  Marks Grade :
//  1-100 A
//  1-90 B
//  1-80 B
//  1-70 C
//  1-60 D
//  41-50 DD40 Fail
  

import java.util.Scanner;

public class Opps_Q_012 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks...out of 100...");
		int marks = sc.nextInt();
		calculategrade(marks);
	}
	public  static void
	calculategrade(int marks)
	{
		if(marks>=91&&marks<=100)
		{
			System.out.println("grade A...");
		}
		else if(marks>=81&&marks<=100)
		{
			System.out.println("grade B...");
		}
		else if(marks>=71&&marks<=80)
		{
			System.out.println("grade C...");
		}
		else if(marks>=61&&marks<=70)
		{
			System.out.println("grade d...");
		}
		else if(marks>=51&&marks<=60)
		{
			System.out.println("grade DD...");
		}
		else if(marks>=41&&marks<50)
		{
			System.out.println("grade DD40...");
		}
		else
		{
			System.out.println("grade Fail...");
		}
	}
}
