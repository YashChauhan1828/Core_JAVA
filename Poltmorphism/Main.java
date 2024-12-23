package Poltmorphism;

import java.util.Scanner;

public class Main 
{
	public static void getPersonProfile(Person person)
	{
		person.getBehave();
		if(person instanceof Org)
		{
			Org employee = (Org)person;
			employee.getonwork();
		}
		else if(person instanceof Home)
		{
			Home hm = (Home)person;
			hm.getmovietime();
		}
		else if(person instanceof PublicPlace)
		{
			PublicPlace pp = (PublicPlace)person;
			pp.getAttendEvent();
		}
		else if(person instanceof School)
		{
			School sl = (School)person;
			sl.getAnnualEvent();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1) Organization");
			System.out.println("2) Home");
			System.out.println("3) PublicPlace");
			System.out.println("4) School");
			System.out.println("5) Exit");
			System.out.println("Enter The location");
			int choice = sc.nextInt();
			switch (choice) 
				{
					case 1:Org org = new Org();
					getPersonProfile(org);
					break;
					case 2:Home home = new Home();
					getPersonProfile(home);
					break;
					case 3:PublicPlace publicplace = new PublicPlace();
					getPersonProfile(publicplace);
					break;
					case 4:School school = new School();
					getPersonProfile(school);
					break;
					case 5:System.exit(0);
					break;
					default:
						System.out.println("Invalid Choice");
						break;
				}
		}
	}
}