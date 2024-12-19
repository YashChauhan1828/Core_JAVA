package Conditional_Statement;

import java.util.Scanner;

public class TestApp0 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		Integer No = sc.nextInt();
		if(No > 0)
		{
			System.out.println("Number is Positive");
		}
		sc.close();
	}
}
