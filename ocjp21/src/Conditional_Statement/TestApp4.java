package Conditional_Statement;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		Integer No1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		Integer No2 = sc.nextInt();
		while(true)
		{
			System.out.println("Enter Choice : ");
			Integer choice = sc.nextInt();
			System.out.println("1) Addition");
			System.out.println("2) Substraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Exit");
		
			Integer ans;
			float ans1;
			switch(choice)
			{
				case 1:ans = No1 + No2;
				System.out.println("Addition is " +ans);
				break;
			
				case 2:ans = No1 - No2;
				System.out.println("Substraction is " +ans);
				break;
	
				case 3:ans = No1 * No2;
				System.out.println("Multiplication is " +ans);
				break;
		
				case 4:ans1 = No1 / No2;
				System.out.println("Division is " +ans1);
				break;
		
				case 5:System.exit(0);
				break;
		
				default: System.out.println("Invalid Choice");	
			}
		}
	}
}