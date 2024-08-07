package Collections_;

// • Write a Java program to get the number of elements in a hash set.


import java.util.HashSet;

public class Q_013 
{
	public static void main(String[] args)
	{
		HashSet<Integer>numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		int size = numbers.size();
		
		System.out.println("Number of elements in the hashset..."+size);
	}

}
