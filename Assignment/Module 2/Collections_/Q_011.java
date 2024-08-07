package Collections_;

// • Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;

public class Q_011
{
	public static void main(String[] args) 
	{
		HashSet<String> colors = new HashSet<>();
		
		colors.add("red");
		colors.add("Green");
		colors.add("Blue");

		System.out.println("Hashset before appending...");
		System.out.println(colors);
		
		String newColor = "Yellow";
		colors.add(newColor);
		
		System.out.println("\n hashset after appending...");
		System.out.println(colors);
		
	}

}
