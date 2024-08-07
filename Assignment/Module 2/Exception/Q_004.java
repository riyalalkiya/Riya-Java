package Exception;

import java.util.jar.JarException;

//• W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
//  try
//  {//code}
//  catch (Exception e)
//  {//code}
//  catch (Exception e)
//  {//code}

public class Q_004
{
	public static void main(String[] args)
	{
		try {
			try {
				int [] numbers = {1,2,3};
				System.out.println(numbers[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("array index pot of bounds..."+e.getMessage());
			}
			String str=null;
			System.out.println(str.length());
			int  a = 10,b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurred..."+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Some other exception occurred.."+e.getMessage());
		}	
	}
}
