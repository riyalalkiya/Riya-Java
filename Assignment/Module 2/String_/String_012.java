package String_;
/*
 * • Create a class named 'Print Number' to print various numbers of different data types by
 *  creating different methods with the same name 'printn' having a parameter for each data type.
 */

public class String_012
{
	class PrintNumber {
	    public void printn(int number) 
	    {
	        System.out.println("Integer: " + number);
	    }

	    public void printn(double number) {
	        System.out.println("Double: " + number);
	    }

	    public void printn(float number) {
	        System.out.println("Float: " + number);
	    }

	    public void printn(String text) {
	        System.out.println("String: " + text);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        String_012 printer = new String_012();
	        
	        printer.printn(10);                
	        printer.printn(20.5);             
	        printer.printn(15.5f);             
	        printer.printn("Hello, World!");   
	    }
	}

	public void printn(double d) {
		// TODO Auto-generated method stub
		
	}

	public void printn(String string) {
		// TODO Auto-generated method stub
		
	}
	public void printn(int i) {
		// TODO Auto-generated method stub
		
	}
}
