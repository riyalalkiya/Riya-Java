package Oops_;

// • Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//   two methods to print the area and perimeter of the rectangle respectively. Its 
//   constructor having parameters for length and breadth is used to initialize the length 
//   and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
//   constructor having a parameter for its side (suppose s) calling the constructor of its 
//   parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.



class rectangle
{
	int length,breadth;
	public rectangle(int a, int b)
	{
		length=a;
		breadth=b;
		
	}
	public void calculatearea()
	{
		int area = length*breadth;
		System.out.println("area of rectangle..."+area);
	}
	public void calculateperimater()
	{
		int 
		perimeter=2*(length+breadth);
		System.out.println("perimeter of rectangle ..."+perimeter);
	}
	}
class Square extends rectangle
{
	Square(int s)
	{
		super(s,s);
	}
}
public class Oops_Q_004 
{
	public static void main(String[] args)
	{
		rectangle rectangle=new rectangle(1,2);
		rectangle.calculatearea();
		rectangle.calculateperimater();
		Square square=new Square(5);
		square.calculatearea();
		square.calculateperimater();
	
	}
}
