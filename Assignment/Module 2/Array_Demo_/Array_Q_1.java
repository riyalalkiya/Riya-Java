package Array_Demo_;

// Write a java program to find out max number from given array using function.

public class Array_Q_1 
{

	public static void main(String[] args)
	{
		int[] num  = {10,5,20,8,15};
		int maxNumber = findMax(num);
		
		System.out.println("Maximam number in the array..."+maxNumber);
	}
	public static int findMax(int []arr)
	{
		int max = Integer.MIN_VALUE;
		for(int num :arr)
		{
			max = Math.max(max,num);
		}
		return max;

	}
}
