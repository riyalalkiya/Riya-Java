package Oops_;

// • Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
//   5 units by creating a class named 'Triangle' without any parameter in its constructor.

class triangle
{
	int side1=3;
	int side2=4;
	int side3=5;
	
	public void calculaterarea() {
		double s = (side1+side2+side3)/2.0;
		Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("area of triangle ..."+s);
	}
	public void ccalculaterperimeter()
	{
		int perimeter=side1+side2+side3;
		System.out.println("perimeter of tringle..."+perimeter);
	}
}
public class Oops_Q_005
{
	public static void main(String[] args)
	{
		triangle triangle = new triangle ();
		triangle.calculaterarea();
		triangle.ccalculaterperimeter();
	}

}
