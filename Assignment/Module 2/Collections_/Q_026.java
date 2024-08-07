package Collections_;

//• Write a Java program to print all the elements of an Array List using the position of the elements.



import java.util.ArrayList;

public class Q_026 
{
	public static void main(String[] args)
	{
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Elements of the array lilst with their position...");
		for(int i=0; i<numbers.size(); i++)
		{
		
		System.out.println("position"+i+":"+numbers.get(i));
		}
	}
}
