package Conditional_Statement;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		Integer age = sc.nextInt();
	
		System.out.println("Your age is : " +age);
		if(age > 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}
	
	}
}
