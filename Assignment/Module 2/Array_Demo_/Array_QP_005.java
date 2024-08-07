package Array_Demo_;

// write  a java program find out length of string without using inbuilt function. 

public class Array_QP_005
{
	public static void main(String[] args)
	{
		String str = "hello"; // example string
		int length = findLength(str);
		System.out.println("length of the string ..."+length);
	}
	public static  int findLength(String str) 
	{
		int count = 0;
		char[] chararray = str.toCharArray();
		
		for(char c: chararray)
		{
			count++;
		}
		return count;
	}
}
