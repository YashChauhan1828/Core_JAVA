package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1: ");
		Integer no1 = sc.nextInt();
		System.out.println("Enter No2: ");
		Integer no2 = sc.nextInt();
		Integer ans = no1 + no2 ; 
		System.out.println("Addition is "+ans);
	}
}
