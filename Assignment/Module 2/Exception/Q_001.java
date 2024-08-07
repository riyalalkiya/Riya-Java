package Exception;

/*
 * • W.A.J. P to demonstrate try catch block,
 */

public class Q_001
{
	public static void main(String[] args)
	{
		try
		{
			int[] numbers= {1,2,3};
			System.out.println(numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught..."+e);
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println("program continues...");	
	}
}
