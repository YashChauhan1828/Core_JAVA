package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		System.out.println("Enter your Name : ");
		 // name = sc.next();
		name = sc.nextLine();
		 System.out.println("Name is : " +name);
		
		System.out.println("Length is : " +name.length());
	}
}
