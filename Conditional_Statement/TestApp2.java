package Conditional_Statement;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		Integer No = sc.nextInt();
		if(No > 0)
		{
			System.out.println("Number is positive");
		}
		else if(No == 0 )
		{
			System.out.println("Number is Neutral");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}
