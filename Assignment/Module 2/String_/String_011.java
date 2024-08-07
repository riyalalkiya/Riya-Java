package String_;

/*
 * • W.A.J.P to find the second most frequent character in a given string. The given string is: successes 
 * The second most frequent char in the string is: c
 */
public class String_011 
{
	public static void main(String[] args)
	{
		String str="successes";
		char result = findSecondMostChar(str);
		System.out.println("The second most frequent char in the string is"+result);
	}

	public  static char findSecondMostChar(String str)
	{
		int[] count = new int[256];
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			count[ch]++;
		}
		char firstMax ='\0', secondMax = '\0';
		int maxCount = 0;
		int maxCount1=0;
		for(int i=0; i<256; i++)
		{
			int secondMaxCount;
			int secondmaxCount = 0;
			if(count[i]>maxCount1)
			{
				secondMax = firstMax;
				secondMaxCount= maxCount1;
				firstMax = (char)i;
				maxCount1 = count[i];
			}
			else if(count[i]>secondmaxCount && count[i]!=maxCount1)
			{
				secondMax = (char)i;
				secondMaxCount = count[i];			
			}
		}
		return secondMax;
	}
}
