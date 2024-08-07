package Collections_;

// • Write a Java program to check whether a map contains key-value mappings (empty) or not.



import java.util.HashMap;
import java.util.Map;

public class Q_023
{
	public static void main(String[] args) 
	{
      Map<String, String> map = new HashMap<>();
      if (map.isEmpty())
      {
	  System.out.println("The map is empty.");
      } 
      else
	  {
      System.out.println("The map contains key-value mappings.");
      }

	  map.put("Key1", "Value1");
      map.put("Key2", "Value2");

	  if (map.isEmpty()) {
      System.out.println("The map is empty.");
      }
	  else
	  {
      System.out.println("The map contains key-value mappings.");
	  }	        
	}
}
