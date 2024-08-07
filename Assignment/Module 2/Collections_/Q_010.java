package Collections_;

//• Write a Java program to shuffle elements in an array list.


import java.util.ArrayList;
import java.util.Collections;

public class Q_010
{
	public static void main(String[] args)
	{
		ArrayList<Integer>numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Array list before shuffling...");
		System.out.println(numbers);

		Collections.shuffle(numbers);
		
		System.out.println("\n ArrayList after shuffling...");
		System.out.println(numbers);
		
	}

}
