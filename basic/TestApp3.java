package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1: ");
		Integer No1 = sc.nextInt();
		System.out.println("Enter No2: ");
		Integer No2 = sc.nextInt();
		
		Integer temp = No1;
		No1 = No2;
		No2 = temp;
		
		System.out.println("No1 "+No1);
		System.out.println("No2 "+No2);
	}
}
