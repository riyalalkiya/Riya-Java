package String_;
/*
 * • W.A.J.P to check whether a given string starts with the contents of another string.
 *  Red is favorite color. Starts with Red? True Orange is also my favorite color.
 *   Startswith Red? False I3.
 */

public class String_009
{
	public static void main(String[] args)
	{
		String mainString1="red is favorite color...";
		String checkString1="red";
		boolean startWith1=mainString1.startsWith(checkString1);

		String startsWith1 = null;
		System.out.println("\""+mainString1+"\"StartsWith\""+checkString1+"\"?"+startsWith1);
		
		String mainString2="Orange  is also my favorite color...";
		String checkString2="red";
		boolean startWith2=mainString2.startsWith(checkString2);
		String startsWith2 = null;
		System.out.println("\""+mainString2+"\"StartsWith\""+checkString2+"\"?"+startsWith2);
	}
	

}
