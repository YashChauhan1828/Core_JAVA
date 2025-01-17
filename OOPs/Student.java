package OOPs;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	double marks;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		System.out.println("Enter the marks : ");
		marks = sc.nextInt();
		System.out.println("Enter the std : ");
		std = sc.nextInt();
	}
	public void Dispaly()
	{
		System.out.print("\n"+rno+"\n"+name+"\n"+std+"\n"+marks);
	}
}
