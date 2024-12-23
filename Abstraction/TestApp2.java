package Abstraction;

import java.util.Scanner;

public class TestApp2 
{
	public static void gettypevehicle(Vehicle vehicle)
	{
		vehicle.getSpec();
		if(vehicle instanceof Lmvvehicle)
		{
			Lmvvehicle lmvvehicle = (Lmvvehicle)vehicle;
			lmvvehicle.getLMVInfo();
		}
		else if(vehicle instanceof Hmvvehicle)
		{
			Hmvvehicle hmvvehicle = (Hmvvehicle)vehicle;
			hmvvehicle.getHmvModelInfo();
		}
		else if(vehicle instanceof Twvehicle)
		{
			Twvehicle twvehicle = (Twvehicle)vehicle;
			twvehicle.getTwModelInfo();		
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) LMV Vehicle");
		System.out.println("2) HMV Vehicle");
		System.out.println("3) TMV Vehicle");
		System.out.println("4) Exit");
		System.out.println("Enter the type of Vehicle");
		Integer choice = sc.nextInt();
		switch (choice) 
		{
			case 1: Lmvvehicle lmvVehicle = new Lmvvehicle();
					gettypevehicle(lmvVehicle);
					break;
			case 2:	Hmvvehicle hmvVehicle = new Hmvvehicle();
					gettypevehicle(hmvVehicle);
					break;
			case 3:	Twvehicle twVehicle = new Twvehicle();
					gettypevehicle(twVehicle);
					break;
			case 4: System.exit(0);		
					break;
			default:System.out.println("Invalid Vehicle Choice");
			break;
		}
	}
}
