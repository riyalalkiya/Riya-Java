package Collections_;

// • Write a Java program to search an element in an array list.
// • Write a Java program to remove the third element from an array list.


import java.util.ArrayList;

public class Q_007 
{
	public static void main(String[] args ) 
	{
		ArrayList<String>colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Grean");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Orange");
		
		String searcelement = "Blue";
		if(colors.contains(searcelement)) 
		{
			System.out.println("Element ..."+searcelement+" found in the ArrayList");
			System.out.println("Element ..."+searcelement+"not found in the ArrayList");

		}
	}

}
