package Bank_Application_Project;

public class BankAccount 
{
	protected String AccountNumber;
	protected String AccountHolderName;
	protected double Balance;

	public BankAccount(String AccountNumber , String AccountHolderName , double Balance) 
	{
		this.AccountNumber = AccountNumber;
		this.AccountHolderName = AccountHolderName;
		this.Balance = Balance;
	}
	
	public void deposite(int amount) 
	{
		Balance += amount;
		System.out.println("Depeosited Amount : " +amount);
		System.out.println("Current Balance : " +Balance);
	}
	public void withdraw(int amount) 
	{
		if (amount > Balance) 
		{
			System.out.println("Insufficient Balance");
		} 
		else 
		{
			Balance -= amount;
			System.out.println("Withdrawal Amount : "+amount);
			System.out.println("Current Balance : " +Balance);
		}	
	}
	public void AccountDetails() 
	{
		System.out.println("Account Number : " +AccountNumber);
		System.out.println("Account Holder Name : " +AccountHolderName);
		System.out.println("Balance : " +Balance);
	}
}
