package assigment;

public class Basic1
//• Write a Java program to Take three numbers from the user and print the greatest 
//  numbers;
{
	public static void main(String[] args)
	{
		int a=20,b=40,c=60;
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);	
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		
	     	
	}

}
