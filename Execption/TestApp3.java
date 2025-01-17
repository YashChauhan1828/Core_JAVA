package Execption;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans;
		System.out.println("Enter the no1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter the no2 : ");
		no2 = sc.nextInt();
		try
		{
			ans = no1/no2;
		}
		catch(Exception e)
		{
			ans=0;
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am Finally block ");
		}
	
		System.out.println("Answer : "+ans);
	}
}
