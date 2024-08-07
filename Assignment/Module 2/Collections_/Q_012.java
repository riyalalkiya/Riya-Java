package Collections_;

//• Write a Java program to iterate through all elements in a hash list.


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Q_012
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		HashMap<String,Integer>map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("orange", 3);
		map.put("Grapes", 4);
		map.put("Mango", 5);
		
		System.out.println("iterating over keys using enhanced for loop...");
		for(String key:map.keySet())
		{
			System.out.println("klterkey"+key+"value"+map.get(key));
		}
		System.out.println("\n lterating over entries using enhanced for loop...");
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("key"+entry.getKey());
		
			
			
		}
		
		
	}
}
