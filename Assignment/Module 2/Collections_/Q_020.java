package Collections_;

//• Write a Java program to join two array lists.


import java.util.ArrayList;

public class Q_020
{  
	public static void main(String[]args) 
	{
		ArrayList<Integer>list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		
		ArrayList<Integer>list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list1.addAll(list2);
		System.out.println("joined arraylist...");
		System.out.println(list1);
	}
}
