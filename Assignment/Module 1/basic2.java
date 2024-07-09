package assigment;

import java.util.Scanner;

// Write A java program takes the user to provide a single character from the alphabet. print vowel 
// or consonant, depending on the user input. if the user input is not a letter (between a and z or A 
// A and Z ), or is a string of length > 1, print an error message.

public class basic2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A Single Character from the alphabet");
		String input = sc.next();
		
		if (input.length()>1)
		{
			System.out.println("Error input string length must be 1");
		}
		else
		{
		char ch = input.charAt(0);
		if(ch== 'a'|| ch=='e'| ch=='i'| ch=='o'| ch=='u'| ch=='A'| ch=='E'|ch=='I'|ch=='O'|ch=='U')
		{
			System.out.println("vowel");
		}
		else if((ch>='a' && ch<='z')|| (ch>='A' && ch>'Z'))
		{
			System.out.println("consonant");
		}
		else
		{
			System.out.println("Error ...input must be a letter...(a-z or A-Z");
		           }
		      }
	       }
	}
