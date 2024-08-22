package project2;
import java.util.Scanner;
public class SimpleIntrest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		int princ = sc.nextInt();
		System.out.println("Enter the rate:");
		int rate = sc.nextInt();
		System.out.println("Enter time in years");
		int time = sc.nextInt();
		int simpleintrest = (princ*rate*time)/100;
		System.out.println("Simple intrest is :"+ simpleintrest);
	}

}
