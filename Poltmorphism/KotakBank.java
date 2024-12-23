package Poltmorphism;

public class KotakBank extends RbiBank
{
	double rateOfInterest = 10;
	public double getRoi()
	{
		
		System.out.println("Rate of Interest og KotakBank is : "+rateOfInterest);
		return rateOfInterest;
	}
	public void  getDigital_811_Account() 
	{
		System.out.println("Kotak Bank provides Digital 811 Account opening Services");
	}
}
