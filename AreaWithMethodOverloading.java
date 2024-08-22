package project2;
public class AreaWithMethodOverloading 
{
	public double area(double side)
	{
		return side*side;
	}
	public double area(double length, double breadth)
	{
		return length*breadth;
	}
	public double area(int radius)
	{
		return 3.147*radius*radius;
	}
	public static void main(String args[])
	{
		 AreaWithMethodOverloading MyObj = new  AreaWithMethodOverloading();
		 System.out.println("Area of the Sqaure : " + MyObj.area(5.5));
		 System.out.println("Area of the Recatangle : " + MyObj.area(5.5,4.5));
		 System.out.println("Area of the Circle : " + MyObj.area(5));
	}

}
