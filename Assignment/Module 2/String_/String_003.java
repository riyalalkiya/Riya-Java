package String_;

import java.util.Scanner;

/*
 * • Write a Java program that accepts an integer (n) and computes the value of
 *   n+nn+nnn.
 *   Input number: 55 + 55 + 555
 */

public class String_003
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a Number...(n)");
		int n = sc.nextInt();
		int nn = n*10+n;
		int nnn = n*100+nn;
		int sum = n+nn+nnn;
		System.out.println("n+nn+nnn="+n+"+nn+"+nnn+"="+sum);

		
		
	}

}
