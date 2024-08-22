package project2;
import java.util.Scanner;
public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String Name = sc.nextLine();
		System.out.println("Enter college name:");
		String college = sc.nextLine();
		System.out.println("Enter roll number:");
		String rollno = sc.nextLine();
		System.out.println("Name :" + Name);
		System.out.println("College Name :" + college);
		System.out.println("Roll Number :" + rollno);
		
	}

}
