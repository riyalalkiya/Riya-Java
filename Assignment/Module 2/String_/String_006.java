package String_;

/*
 * • W.A.J.P to concatenate a given string to the end of another string.
 */

public class String_006
{
	public static void main(String[] args) 
	{
		String originalString="hello,";
		String appendString="World";
		String concatenatedString1=originalString.concat(appendString);
		String concatenatedString2=originalString+appendString;
		System.out.println("OriginalString..."+originalString);
		System.out.println("String to append.."+appendString);
		
		System.out.println("concatenatedString Using concact()..."+concatenatedString1);
		System.out.println("concatenatedString using+operator..."+concatenatedString2);
	}
}
