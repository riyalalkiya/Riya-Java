package Collections_;

// • Write a Java program to replace the second element of an Array List with the specified element.



import java.util.ArrayList;

public class Q_025
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Chery");
		list.add("Date");
		
		System.out.println("ArrayList before replacement...");
		System.out.println(list);
		if(list.size()>=2) {
			list.set(1, "mango");
			
		}
		
		
		
	}

}

