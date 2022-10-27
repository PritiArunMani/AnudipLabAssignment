package program1;

class Shape
{
	void Display() 
	{
		System.out.println("Shape...");
	} 	
}
class Circle extends Shape
{
	void area( )
		{
		double p = 3.76;
		int r = 4;
		double a = p*r*r;
		System.out.println("Area of Circle= "+a+" sq.m");
		}
	
}
class Triangle extends Circle
{
	void area1( )
	{
		int h = 4;
		int l = 6;
		double a = h*l/2;
		System.out.println("Area of Triangle= " +a +"sq.m");
	
	}
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
		t.area();
		t.area1();
	
		
	

	}


}
