package Collections_;

//• Write a Java program to compare two array lists.


import java.util.ArrayList;

public class Q_018 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		boolean isEqual= list1.equals(list2);		
		if(isEqual) {
			System.out.println("the arrayLists are equal...");
		}
		else {
			System.out.println("the arraylista are not equals...");
		}
	}
}
