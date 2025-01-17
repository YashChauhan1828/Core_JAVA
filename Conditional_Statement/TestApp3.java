package Conditional_Statement;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1");
		Integer No1 = sc.nextInt();
		System.out.println("Enter No2");
		Integer No2 = sc.nextInt();
		System.out.println("Enter No3");
		Integer No3 = sc.nextInt();
		
		if(No1 > No2)
		{
			if(No1 > No3)
			{
				System.out.println("Number one is greater "+No1);
			}
			else
			{
				System.out.println("Number three is greater" +No3);
			}
		}
		else
		{
			if(No2 > No3)
			{
				System.out.println("Number two is greater "+No2);
			}
			else
			{
				System.out.println("Number three is greater "+No3);
			}
		}
	}
}
