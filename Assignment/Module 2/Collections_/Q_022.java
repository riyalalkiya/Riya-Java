package Collections_;

//• Write a Java program to convert a hash set to a List/Array List.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q_022 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");
		set.add("Mango");
		
		List<String>list = new ArrayList<>(set);
		System.out.println("Elements int the ArrayList...");
		for(String fruits:list) {
			System.out.println();
		}
	}

}
