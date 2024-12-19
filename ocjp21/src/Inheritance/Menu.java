package Inheritance;

import java.util.Scanner;

public class Menu 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TechEmployee techemp = new TechEmployee();
		AdminEmployee adminemp = new AdminEmployee();
		Integer choice;
		while(true)
		{
		System.out.println("1) TechEmployee");
		System.out.println("2) AdminEmployee");
		System.out.println("3) Exit");
		System.out.println("Enter The Choice");
		choice = sc.nextInt();
		switch (choice) 
		{
		case 1:techemp.ScanData();
			   techemp.DisplayData();			
			   break;
		case 2:adminemp.ScanData();
		       adminemp.DisplayData();			
		       break;
		case 3:System.exit(0); 
			   break;	
		default:
			   System.out.println("Invalid Chioce");
			   break;
		}
				
	}
}
}