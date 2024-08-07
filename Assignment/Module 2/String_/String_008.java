package String_;
/*
 * • W.A.J.P to check whether a given string ends with the contents of another string. 
 * "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
 */

public class String_008
{
	public static void main(String[] args)
	{
		String mainString1="java Exercises";
		String checkString1="se";
		boolean endsWith1=mainString1.contains(checkString1);
		System.out.println("\""+mainString1+"\"ends With\""+checkString1+"\"?"+endsWith1);
		
		String mainString2="java Exercises";
		String checkString="se";
		boolean endswith2=mainString2.contains(checkString);
		System.out.println("\""+mainString2+"\"ends With\""+checkString1+"\"?"+endswith2);	
	}
}
