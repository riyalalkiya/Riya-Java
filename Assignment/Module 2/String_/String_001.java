package String_;

import java.util.Scanner;

/*
 * • Write a Java program to count the letters, spaces, numbers and other characters of an input 
 *    string.
 */

public class String_001
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String...");
		String input=sc.nextLine();
		
		int letters = 0,spaces = 0, numbers =0 , other =0;
		for(int i=0;i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(Character.isLetter(ch))
			{
				letters++;
				
			}else if(Character.isWhitespace(ch))
			{
				spaces++;
			}
			else {
				other++;
			}
		}
			System.out.println("Letters.."+letters);	
			System.out.println("Spaces..."+spaces);
			System.out.println("numbers..."+numbers);
			System.out.println("other character..."+other);
		
		
	}

}
