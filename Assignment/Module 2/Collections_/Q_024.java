package Collections_;

// • Write a Java program to increase the size of an array list.


import java.util.ArrayList;

public class Q_024 
{
	public static <integer> void main(String[] args)
	{
		ArrayList<String>numbers= new ArrayList<>();
		System.out.println("initial Capacity of ArrayList..."+numbers.size());
		
		numbers.add(1, null);
		numbers.addAll(2, null);
		numbers.addAll(3, null);

		System.out.println("Cuurent Cpacity of Array..."+numbers.size());
		
		numbers.add(4, null);
		numbers.add(5, null);
		numbers.add(6, null);
		
		System.out.println("Updated Capacity of ArrayList..."+numbers.size());	
	}
}
