package Exception;

// • W.A.J. P to demonstrate try catch block, take two numbers from the user by 
//   Command line argument and perform the division operation and handle Arithmetic


import java.util.zip.DataFormatException;

public class Q_005
{
	public static void main(String[] args) throws DataFormatException
	{
		if(args.length<2){
		System.out.println("Usage: java division Exampe...<number1><number2>");
		return;
		}
		try {
		int num1= Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int result=num1/num2;
		System.out.println("Division result is..."+result);
		
		}
		catch(ArithmeticException e) {
			System.out.println("Error Divisoin by Zero is Not allowed....");
		}
		
	}

}
