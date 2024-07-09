package assigment;

//Write a Program in Java to display The Pattern Like Right angle Triangle With A Number.
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class Basic5
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
