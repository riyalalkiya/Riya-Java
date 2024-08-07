package Oops_;

// • We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
//   class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
//   parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
//   parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
//   side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
//   all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//   area of rectangle, square and circle respectively. Create an object of class 'Area' and 
//   call all the three methods.
abstract class shape
{
	abstract void rectanglearea(int length,int breadth);
	void squarearea(int side)
	{
		
	}
	abstract void circlearea(int radius);
}
class area extends shape
{
	//@override
	void rectanglearea(int length,int breadth)
	{
		int area = length*breadth;
		System.out.println("area of rectangle..."+area);
	}
	//@averride
	void squarearea(int side)
	{
		int area=side*side;
		System.out.println("area of square..."+area);
	}
	void circlearea(int radius)
	{
		double area=Math.PI*radius*radius;
		System.out.println("area of circle..."+area);
	}
}
public class Oops_Q_011
{
	public static void main(String[] args)
	{
		area obj=new area();
		obj.rectanglearea(4, 6);
		obj.squarearea(2);
		obj.circlearea(8);	
	}
}
