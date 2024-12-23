package Poltmorphism;

import java.util.Scanner;

public class TestApp 
{
	public static void getBankServices(RbiBank rbibank)
	{
		double rateOfInterest = rbibank.getRoi();
		if(rbibank instanceof AxisBank)
		{
			AxisBank axisbanke = (AxisBank)rbibank;
			axisbanke.getWealthManagementServices();
		}
		else if(rbibank instanceof SBIBank)
		{
			SBIBank sbibanke = (SBIBank)rbibank;
			sbibanke.getAgriculturalLoanSchemes();
		}
		else if(rbibank instanceof KotakBank)
		{
			KotakBank kotakbanke = (KotakBank)rbibank;
			kotakbanke.getDigital_811_Account();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Axis Bank");
		System.out.println("2) SBI Bank");
		System.out.println("3) Kotak Bank");
		System.out.println("4) Exit");
		System.out.println("Select the Bank");
		Integer choice = sc.nextInt();
		switch (choice) {
		case 1:	AxisBank axisbank = new AxisBank();
				getBankServices(axisbank);
				break;
		case 2:	SBIBank sbibank = new SBIBank();
				getBankServices(sbibank);
				break;
		case 3:	KotakBank kotakbank = new KotakBank();
				getBankServices(kotakbank);
				break;
		case 4 :System.exit(0);		
		default:System.out.println("Select valid Bank");
			break;
		}
	}
}
