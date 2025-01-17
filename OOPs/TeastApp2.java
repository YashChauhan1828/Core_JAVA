package OOPs;

import java.util.Scanner;

public class TeastApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll no : ");
		s1.rno = sc.nextInt();
		System.out.println("Enter the name : ");
		s1.name = sc.next();
		System.out.println("Enter the marks : ");
		s1.marks = sc.nextInt();
		System.out.println("Enter the std : ");
		s1.std = sc.nextInt();
	
		System.out.println("Enter the roll no : ");
		s2.rno = sc.nextInt();
		System.out.println("Enter the name : ");
		s2.name = sc.next();
		System.out.println("Enter the marks : ");
		s2.marks = sc.nextInt();
		System.out.println("Enter the std : ");
		s2.std = sc.nextInt();
		
		System.out.println("Enter the roll no : ");
		s3.rno = sc.nextInt();
		System.out.println("Enter the name : ");
		s3.name = sc.next();
		System.out.println("Enter the marks : ");
		s3.marks = sc.nextInt();
		System.out.println("Enter the std : ");
		s3.std = sc.nextInt();
	
		System.out.print(s1.marks+"\n "+s1.rno+"\n "+s1.std+"\n "+s1.name);
		System.out.print(s2.marks+"\n "+s2.rno+"\n "+s2.std+"\n "+s2.name);
		System.out.print(s3.marks+"\n "+s3.rno+"\n "+s3.std+"\n "+s3.name);
	}
	
}
