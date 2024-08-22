package project2;

public class MethodOverloading 
{
	public int sum (int x)
	{
		return x;
	}
	public int sum(int x,int y)
	{
		return x+y;
	}
	public double sum(double x, double y, double z)
	{
		return x+y+z;
	}
	public static void main(String args[])
	{
		MethodOverloading  add = new MethodOverloading ();
		System.out.println("with single variable : " + add.sum(8));
		System.out.println("with two variables and type integers : " +add.sum(9,5));
		System.out.println("with three variables and type floats : " +add.sum(5.8,4.9,1.1));
	}
}
