package Collections_;

//• Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class Q_006
{
	public static void main(String[] args) {
		
		ArrayList<String>fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		
		System.out.println("ArrayList before removeal...");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		int indexToRemove = 2;
		
		fruits.remove(indexToRemove);
		
		System.out.println("\n arraylist after removal....");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}		
	}
}
