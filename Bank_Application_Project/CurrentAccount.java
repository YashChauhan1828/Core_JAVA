package Bank_Application_Project;

public class CurrentAccount extends BankAccount
{
	private double overdraftlimit;
	public CurrentAccount(String AccountNumber , String AccountHolderName , double Balance , double overdraftlimit)
	{
		super(AccountNumber , AccountHolderName , Balance);
		this.overdraftlimit = overdraftlimit;
	}
	public void withdraw(double amount) 
	{
		if (amount <= (Balance + overdraftlimit)) 
		{
			Balance -= amount;
			System.out.println("Withdrawal amount : "+amount);
			System.out.println("Curent Balance: "+Balance);
		} 
		else 
		{
			System.out.println("Withdrawal Exceds overdraft Limit");
		}
	}
}
