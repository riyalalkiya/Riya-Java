package Collections_;

//• Write a Java program to iterate through all elements in an array list.


import java.util.ArrayList;

public class Q_002
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Iterating throught the arraylist....");
		for(int i=0; i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}	
	}

}
