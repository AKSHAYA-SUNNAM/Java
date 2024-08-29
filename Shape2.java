package project2;
class shape1
{
	 void getArea()
	{
		int length=5;
		int breadth=5;
		int area= length*breadth;
		System.out.println("Area of rectangle:"+area);
	}
}
class rectangle extends shape1
{
	void getArea()
	{
		int length=10;
		int breadth=10;
		int area= length*breadth;
		System.out.println("Area of rectangle:"+area);
	}
}
public class Shape2
{
public static void main(String args[])
	{
		rectangle obj2 =new rectangle();
		obj2.getArea();
		 
		 
	}
}




