package Bank_Application_Project;

import java.util.Scanner;

public class Run 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Integer choice ; 
		System.out.println("1) Savings Account");
		System.out.println("2) Current Account");
		System.out.println("3) Exit");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:SavingsAccount savingsaccount = new SavingsAccount("BARB0", "Yash", 100000, 3.0);
				   int choice1;
				   while(true)
				   {
					   System.out.println("1) Deposite");
					   System.out.println("2) Withdraw");
					   System.out.println("3) Account Details");
					   System.out.println("4) Exit");
					   System.out.println("Enter the choice");
					   choice1 = sc.nextInt();
					   switch(choice1)
					   {
					   	  case 1:System.out.println("Enter The amount to be deposited ");
			              int amount = sc.nextInt();		
			              savingsaccount.deposite(amount);	
			    	      break;
					   	  case 2:System.out.println("Enter The amount to be withdraw ");
		              	  int amount1 = sc.nextInt();		
		              	  savingsaccount.withdraw(amount1);	
		    	          break;
					   	  case 3:savingsaccount.addInterest();
			    	      savingsaccount.AccountDetails();
			    	      break;
					   	  case 4:System.exit(0);
			       		  break;	
					   }
				   }
			case 2:CurrentAccount currentaccount = new CurrentAccount("BARBO12", "TEJAL", 10000, 100000);
				   int choice2;
				   while(true) 
				   {
					   System.out.println("1) Deposite");
					   System.out.println("2) Withdraw");
					   System.out.println("3) Account Details");
					   System.out.println("4) Exit");
					   System.out.println("Enter the choice");
					   choice2 = sc.nextInt();
					   switch(choice2)
					   {
					   	  case 1:System.out.println("Enter The amount to be deposited ");
					   	  int amount = sc.nextInt();		
					   	  currentaccount.deposite(amount);	
		    	          break;
		                  case 2:System.out.println("Enter The amount to be withdraw ");
	              	      double amount1 = sc.nextDouble();		
	              	      currentaccount.withdraw(amount1);	
	    	              break;
		                  case 3:currentaccount.AccountDetails();
		    	          break;
		                  case 4:System.exit(0);
		                  break;
		               }
				   
				   }
			
				   
			case 3:System.exit(0);
			break;
		 }
	}
}
