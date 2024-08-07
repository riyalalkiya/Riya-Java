package Collections_;

// • Write a Java program to extract a portion of an array list.


import java.util.ArrayList;
import java.util.List;

public class Q_017 
{
	public static void main(String[] args)
	{
		ArrayList<Integer>numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("original arrayList...");
		
		System.out.println(numbers);
		
		List<Integer>subList=numbers.subList(1, 4);
		
		System.out.println("\n Extracted sublist(from index 1 to 3");
		
		System.out.println(subList);
		
	}

}
