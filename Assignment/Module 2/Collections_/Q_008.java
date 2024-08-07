package Collections_;

//• Write a Java program to sort a given array list.


import java.util.ArrayList;
import java.util.Collections;

public class Q_008
{
	public static void main(String[] args) 
	{
		ArrayList<String>fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		
		System.out.println("Araylist before sorting...");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		Collections.sort(fruits);
		
		System.out.println("'n arraylist after sorting....");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}	
	}
}
