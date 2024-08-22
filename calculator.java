package project2;
import java.util.Scanner;
public class calculator 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = sc.nextInt();
		System.out.println("enter b value:");
		int b = sc.nextInt();
		System.out.println("Enter your choice\n 1.addition\n 2.substaction\n 3.multiplication \n 4.division\n");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("The sum of two nubers is:"+ (a+b));break;
			case 2:System.out.println("The substraction of two nubers is:"+(a-b));break;
			case 3:System.out.println("The multiplication  of two nubers is:"+(a*b));break;
			case 4:System.out.println("The division of two nubers is:" +(a/b));break;
			default: System.out.println("Enter only upto number 4");
		}

	}

}
