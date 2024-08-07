package Collections_;

// • Write a Java program of swap two elements in an array list.


import java.util.ArrayList;
import java.util.Collections;

public class Q_019 
{
	public static void main(String[] args)
	{
		ArrayList<Integer>numbers= new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Arraylist before swappping.....");
		System.out.println(numbers);
		
		int index1=1;
		int index2=3;
		
		Collections.swap(numbers, index1, index2);
		
		System.out.println("\n arraylist after swapping elements at index..."+index1+"and index"+index2+"...");
	}

}
