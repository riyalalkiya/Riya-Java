package Collections_;

// • Write a Java program to get a collection view of the values contained in this map.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q_028 
{
	public static <string, integer> void main(String[] args) 
	{
      Map<String, String> map = new HashMap<>();

      map.put("Key1", "Value1");
      map.put("Key2", "Value2");
      map.put("Key3", "Value3");
      map.put("Key4", "Value4");

      Collection<String> values = map.values();

	  System.out.println("Values in the map:");
	  for (String value : values)
	  {
      System.out.println(value);
      

	  }
	  
	}
}
