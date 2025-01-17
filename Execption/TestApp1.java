package Execption;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1 , no2 , ans=0;
		System.out.println("Enter the number1 : ");
		no1=sc.nextInt();
		System.out.println("Enter the number2 : ");
		no2=sc.nextInt();
		try
		{
			ans = no1/no2;
			String name = null;
			System.out.println("name.length : "+name.length());
			
			int a[] = new int[5];
			
			a[5] = 10;
			
		}
		catch(ArithmeticException | NullPointerException e)
		{
//			ans=0;
			System.out.println(e + "Exception type");
			e.printStackTrace();
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
		}
		System.out.println("Answer is : "+ans);
	}
}
