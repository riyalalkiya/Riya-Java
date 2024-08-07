package Collections_;

//• Write a Java program to compare two sets and retain elements which are same on both sets.



import java.util.HashSet;
import java.util.Set;

import String_.String_001;

public class Q_027
{
	public static void main(String[] args) 
	{	
		Set<String>set2=new HashSet<>();
		set2.add("Banana");
		set2.add("date");
		set2.add("cherry");
		
		System.out.println("Original Set1:"+set2);
		
		set2.retainAll(set2);
		
		System.out.println("\n Set after retaining common elements");
		System.out.println(set2);	
	}
}
