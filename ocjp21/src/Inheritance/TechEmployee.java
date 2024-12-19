package Inheritance;

import java.util.Scanner;

public class TechEmployee extends Employee 
{
	String Department ;
	public void ScanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Id");
		Id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Name");
		name=sc.nextLine();
		System.out.println("Enter The Salary");
		Salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Designation");
		Designation=sc.nextLine();
		System.out.println("Enter The Department");
		Department=sc.nextLine();
	}
	public void DisplayData()
	{
		System.out.println(Id+" "+name+" "+Salary+" "+Designation+" "+Department);
	}
//	public static void main(String[] args) 
//	{
//		TechEmployee e = new TechEmployee();
//		e.ScanData();
//		e.DisplayData();
//	}
}
