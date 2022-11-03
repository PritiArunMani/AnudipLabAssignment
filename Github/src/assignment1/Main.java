package assignment1;

class Shape
{
	void disply() 
	{
		System.out.println("Display Area");
	}
}
class Circle extends Shape
{
	void getArea() 
	{
		double pi = 3.14;
		int r = 6;
		double A = pi*r*r;
		System.out.println("Area of Circle = " + A + "sqm");
	}
}

class Square extends Shape
{
	void getArea() 
	{
		int x = 6;
		int A = x*x;
		System.out.println("Area of Square = " + A + "sqm");
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		s.disply();
		Circle c = new Circle();
		c.getArea();
		Square sa = new Square();
		sa.getArea();

	}

}
