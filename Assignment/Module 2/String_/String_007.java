package String_;

/*
 * • W.A.J.P to compare a given string to the specified character sequence. Comparing 
 *   topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
 */

public class String_007
{
	public static void main(String[] args)
	{
		
		String str1= "topsint.com";
		String str2= "topsint.com";
		
		boolean isEqual1=str1.equals(str2);
		boolean isEqual2=str1.equals(str2);
		
		System.out.println("comparing..."+str1+"and"+str2+"ignoringcase..."+isEqual2);	
	}
}
