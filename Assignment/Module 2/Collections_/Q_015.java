package Collections_;

//• Write a Java program to count the number of key-value (size) mappings in a map.


import java.util.HashMap;
import java.util.Map;

public class Q_015 
{
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();	
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		int size = map.size();
		
		System.out.println("number of key-value mapping in the hashmap..."+size);
	}
}
