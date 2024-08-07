package Collections_;

// Write a Java program to create a new array list, add somecolors (string) and print out the collection.

import java.util.ArrayList;

public class Q_001
{
	public static void main(String[] args)
	{

		        ArrayList<String> colorsList = new ArrayList<>();

		
		        colorsList.add("Red");
		        colorsList.add("Green");
		        colorsList.add("Blue");
		        colorsList.add("Yellow");
		        colorsList.add("Orange");
		        
		        
		        System.out.println("Colors in the ArrayList:");
		        for (String color : colorsList) {
		            System.out.println(color);
		        }
	}
}
