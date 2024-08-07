package Collections_;

//• Write a Java program to copy one array list into another.


import java.util.ArrayList;

public class Q_009
{
	public static void main(String[] args) 
	{
		ArrayList<String>originalList= new ArrayList<>();
		originalList.add("Apple");
		originalList.add("Banana");
		originalList.add("Orange");
		
		ArrayList<String>copiedList = new ArrayList<>();
		copiedList.addAll(originalList);
		
		System.out.println("original ArrayList..."+originalList);
		System.out.println("copied ArrayList..."+copiedList);
	}

}
