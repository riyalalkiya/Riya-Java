package String_;

/*
 * • W.A.J.P to get the character at the given index within the String. Original String = 
 *   Tops Technologies! The character at position 0 is T, The character at position 10 is o.
 */

public class string_005
{
	public static void main(String[] args)
	{
		String originalString = "tops technologies...";
		
		int [] indices = {0,10};
		
		for(int index:indices) {
			if(index>=0&& index<originalString.length()) {
				char character=originalString.charAt(index);
			}
			String character = null;
			System.out.println("the character at position..."+index+" is"+character);	
		}	
	}
}
