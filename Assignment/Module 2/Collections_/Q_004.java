package Collections_;

// • Write a Java program to retrieve an element (at a spec. index) from a given array list.


import java.util.ArrayList;

public class Q_004 
{
	public static void main(String[] args)
	{
		ArrayList<String>fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add(0,"Mango");
		
		System.out.println("Modified ArrayList after inserting at first position....");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
	}

}
