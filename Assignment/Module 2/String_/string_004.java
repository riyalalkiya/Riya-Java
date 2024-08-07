package String_;

import java.time.LocalTime;

/*
 * • Write a Java program to display the system time.
 */

public interface string_004
{
	public static void main(String[] args) 
	{
		LocalTime currenttime = LocalTime.now();
		
		System.out.println("Current system time..."+currenttime);
	}
}
