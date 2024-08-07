package Array_Demo_;

import java.util.Arrays;

import java.util.Scanner;

// Write a java program to take Array  input input from user and sort them in ascending or 
// descending order as per users choice.

public class Array_Q_003
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements In The  Array...");
		
		int a = sc.nextInt();
		int [] arr = new int [a];
		
		System.out.println("Enter The Elements Of The Array...");
		
		for(int i=0; i<a; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter for 'A' for ascending order or 'D' for descending ");
		char order=sc.next().charAt(0);
		
		if(order =='A' || order =='a')
		{
			Arrays.sort(arr);
			System.out.println("Array sorted in ascending order..."+Arrays.toString(arr));
			
		}
		else if(order =='D' || order =='d')
		{
			Arrays.sort(arr);
			int [] descendingArr=new int [a];
			{
				descendingArr[a] = arr[a-1-a];
			}
			System.out.println("array sorted in descanding order..."+Arrays.toString(arr));
		}
		else
		{
			System.out.println("invalid input for sorting order./.Please enter 'A' and 'D'...");
		}	
	}
}
