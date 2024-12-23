package Poltmorphism;

public class AxisBank extends RbiBank 
{
	double rateOfInterest = 12;
	public double getRoi()
	{
		
		System.out.println("Rate of Interest og AxisBank is : "+rateOfInterest);
		return rateOfInterest;
	}
	public void getWealthManagementServices() 
	{
		System.out.println("Axis Bank provides Wealth management services");
	}
}
