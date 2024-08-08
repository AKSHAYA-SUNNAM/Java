package pract;
public class method 
{
	public int add(int x, int y)
	{
		int z = x+y;
		return z;
	}
	public static void main(String args[])
	{
		method MyOj = new method();
		System.out.println(MyOj.add(5,6));
		System.out.println(MyOj.add(7, 8));
	}
}
