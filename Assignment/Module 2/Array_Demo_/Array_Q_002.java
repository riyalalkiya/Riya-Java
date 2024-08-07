package Array_Demo_;

// write a java program to find out the 2nd max number from given array using function.

public class Array_Q_002 
{
	public static void main(String[] args, String secondMAx) 
	{
		int []array = {10,5,20,8,15};
		int firstMax=Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int num:array)
		{
			if(num>firstMax)
			{
				secondMax=firstMax;
				firstMax=num;
			}
			else if(num>secondMax&&num!=firstMax)
			{
				secondMax=num;
			}
		}
		if(secondMax!=Integer.MIN_VALUE)
		{
			System.out.println("The Second Maximam Number In the array is..."+secondMAx);
		}
		else
		{
			System.out.println("unable to find the second maximam number...");
		}	
	}
}
