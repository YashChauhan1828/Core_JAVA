package Bank_Application_Project;

public class SavingsAccount extends BankAccount 
{
	private double InterestRate;
	public SavingsAccount(String AccountNumber , String AccountHolderName , Integer Balance , double InterestRate )
	{
		super(AccountNumber, AccountHolderName, Balance);
		this.InterestRate = InterestRate;
	}
	public void addInterest() 
	{
		double InterestAmount = Balance * (InterestRate/100);
		Balance += InterestAmount;
		System.out.println("Current Balance : "+Balance);
	}
}
