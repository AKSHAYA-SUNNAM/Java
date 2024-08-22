package project2;
import java.util.Scanner;
public class firstletterofname
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		int n = s.length(); 
		String arr[]= s.split(s);
		for(int i =0 ; i<n;i++)
		{
			System.out.println(s.charAt(i));break;
		}
	
	}

}
