package pract;

public class Array 
{
	public static void main(String args[])
	{
		int n[]= {2,3,4,5};
		int min = n[0];
		int max = n[0];
		for(int i=0;i<4;i++)
		{
			if(min>n[i])
			{
				min = n[i];
			}
			if(max<n[i])
			{
				max = n[i];
			}
			
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : "+ min);
	}
}
