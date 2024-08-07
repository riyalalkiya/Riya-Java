package Collections_;

//• Write a Java program to insert an element into the array list at the first position.


import java.util.ArrayList;

public class Q_003
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add(0,"Mango");
		System.out.println("Modifides ArrayList after inserting at first position....");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
	}

}
