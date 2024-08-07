package String_;

import String_.String_013.PrintValue;

/*
 * • Create a class to print an integer and a character with two methods having the same name but
 *  different sequence ofthe integer and the character parameters. For
 */



public class String_013
{
	// Class to demonstrate method overloading with integer and character
	class PrintValue {
	    // Method to print an integer followed by a character
	    public void print(int number, char character) {
	        System.out.println("Integer: " + number + ", Character: " + character);
	    }

	    // Method to print a character followed by an integer
	    public void print(char character, int number) {
	        System.out.println("Character: " + character + ", Integer: " + number);
	    }
	}

	// Main class to test the PrintValue class
	public class Main {
	    public static void main(String[] args) {
	        String_013 printer = new String_013();
	        
	        // Calling the overloaded methods
	        printer.print(10, 'A');  // Calls the method with int first
	        printer.print('B', 20);  // Calls the method with char first
	    }
	}

	public void print(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	
}
	
	
