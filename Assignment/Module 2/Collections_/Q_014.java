package Collections_;

//• Write a Java program to associate the specified value with the specified key in a Hash Map.



import java.util.HashMap;

public class Q_014 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer>map= new HashMap<>();
		
		map.put("one", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		
		System.out.println("HashMap after associating value");
		System.out.println(map);
		
		map.put("four", 4);
		
		System.out.println("\n hashmap after adding a new key - value pair...");
		
		System.out.println(map);

		
		
	}

}
