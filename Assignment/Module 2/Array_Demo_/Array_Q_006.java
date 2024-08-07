package Array_Demo_;

// write a java program to reverse a string and check that the string is palindrome or not.

public class Array_Q_006
{
	public static void main(String[] args)
	{
		String str ="madam"; // example string
		String reversedStr=reverseString(str);
		System.out.println("original string..."+str);
		System.out.println("reversed string..."+reversedStr);
		
		if(str.equals(reversedStr))
		{
			System.out.println("the string is a palindrome...");
		}
		else 
		{
			System.out.println("the string is not a palindrome...");
		}
	}
	public static String reverseString(String str)
	{
		StringBuilder reversed = new StringBuilder();
		for(int i=str.length()-1; i>=0;i--)
		{
			reversed.append(str.charAt(i));
		}
		return reversed.toString();			
	}
}
