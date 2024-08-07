package Collections_;

//• Write a Java program to convert a hash set to an array.


import java.util.HashSet;

public class Q_021
{
	public static void main(String[] args) 
	{
		HashSet<String>set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");
		set.add("Mango");  
		
		String[] array = new String[set.size()];
		set.toArray(array);
		
		System.out.println("Elements in the array....");
		
		for(String fruit:array)
		{
			System.out.println(fruit);
		}
	}

}
