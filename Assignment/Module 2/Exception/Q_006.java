package Exception;

// • W.A.J.P to create the validate method that takes integer value as a parameter. If the 
//   age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//   welcome to vote.


public class Q_006
{
	public static void main(String[] args)
	{
		try
		{
			validateAge(16);
		}catch(ArithmeticException e) {
			System.out.println("Exception in thread main...");
		}
	}

	public static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid...");
		}else
		{
			System.out.println("Welcome to voote...");
		}
		
	}

}
