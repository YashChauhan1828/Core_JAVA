package Poltmorphism;

public class SBIBank extends RbiBank
{
	double rateOfInterest = 8;

	public double getRoi()
	{
			System.out.println("Rate of Interest og SBIBank is : "+rateOfInterest);
			return rateOfInterest;
	}
	public void getAgriculturalLoanSchemes() 
	{
		System.out.println("SBI Bank provides Agricultural Loan Schemes for Farmers ");
	}
}
