package Collections_;

//• Write a Java program to update specific array element by given element.


import java.util.ArrayList;

public class Q_005 
{
	public static void main(String[] args) 
	{
		ArrayList<String>colors = new ArrayList<>();
		colors.add("red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Orange");
		
		System.out.println("ArrayList before updating....");
		for(String color:colors) {
			System.out.println(color);
		}
		int indexToUpdate=2;
		String newColor = "Purple";
		colors.set(indexToUpdate, newColor);
		System.out.println("\nArrayList after updating...");
		for(String color:colors)
		{
			System.out.println(color);
		}
		
		
		
	}

}
