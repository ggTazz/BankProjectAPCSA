import java.util.Scanner;

public class CheckingAccount {
     public static void launcher() {
    
    Savings user = new Savings();
    Acc user2 = new Acc();
    int balance = 100;
    int newAccountNumber;
    
 
    
        //need someone to set balance amounts using ussernames and passwords
       
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);
    Scanner userInput3 = new Scanner(System.in);
    
    //System.out.println("Account number:" + " " + Savings.accountNumber);
    System.out.println("(1) Go to your Savings Account");
    System.out.println("(2) Go to your Checking Account");
    System.out.println("(3) Make a new account");
    int accNDecision = userInput.nextInt();
    	if (accNDecision == 1) {
    		savings();
    	if (accNDecision == 3) {
    		newAccountNumber();
    	}
        if (accNDecision == 2){
             checking();
        }
    	}
     }
     public static int newAccountNumber() {
 		int maxBranchNumber = 100000;
 		int minBranchNumber = 0;
 		int range = maxBranchNumber - minBranchNumber + 1;
 		int newAccountNumber = (int)(Math.random() * range) + minBranchNumber;
 		System.out.println("Your new account number is " + newAccountNumber);
 		return newAccountNumber;	
     }
     public static void savings() {
    	 Savings user = new Savings();
    	 Scanner userInput = new Scanner(System.in);
    	 Scanner userInput2 = new Scanner(System.in);
    	 Scanner userInput3 = new Scanner(System.in);
    	 Acc user2 = new Acc();
		    System.out.println("Your balance is:" + " " + centralBalance.CashMoney());
		    System.out.println("Deposit or withdrawal? Choose one.");
		    	String input = userInput2.nextLine();
		                if (input.equalsIgnoreCase("Deposit"))
		                    {
		                	String yesorno = "yes";
	                        
		                	while (yesorno.equalsIgnoreCase("yes"))
		                	{
		                		System.out.print("Enter a sum to deposit: ");
		                        double deposit = userInput2.nextDouble();
		                        System.out.println("Your balance is now " + (centralBalance.CashMoney() - deposit));
		                        System.out.println("Your saving account's balance is now " + (deposit + centralBalance.CheckingCashMoney()));
		                        System.out.println("Would you like to deposit again? (yes or no)");
		                            yesorno = userInput3.nextLine();                              
		                    }
		                    }	           
		                if (input.equalsIgnoreCase("Withdraw") || input.equalsIgnoreCase("Withdrawal"))
		                	{
		                	String yesorno2 = "yes";
		                	 while (yesorno2.equalsIgnoreCase("yes"))
		 		                    
		 		           {
		                    System.out.println("Enter a sum to withdraw");
		                    double newamount = userInput.nextDouble();
		                    user2.takeMoney(newamount);
		                    
		                        if (newamount > centralBalance.CashMoney())
		                            {
		                            System.out.println("You don't have enough money. You've been charged an overdraft fee.");
		                            System.out.println("Your savings account's balance is " + (centralBalance.CheckingCashMoney() - 20.00 - newamount));
		                            System.out.println("Your balance is " + (centralBalance.CashMoney() + newamount));
		                            }
		                        
		                        else 
		                        	//Ur mom ghey
		                        {
		                        	System.out.println("Your savings account's balance is " + (centralBalance.CheckingCashMoney() - newamount));
		                        	System.out.println("Your balance is " + (centralBalance.CashMoney() + newamount));
		                            System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
		                        }
		                        yesorno2 = userInput3.nextLine();
		                         
		 		           }   
		                }
		            
		        user2.MaintenanceFee();     
     }
     public static void checking() {
		 Savings user = new Savings();
    	 Scanner userInput = new Scanner(System.in);
    	 Scanner userInput2 = new Scanner(System.in);
    	 Scanner userInput3 = new Scanner(System.in);
    	 AutoTellerMachine ATM = new AutoTellerMachine();
    	 Acc user2 = new Acc();
	    System.out.println("Your balance is:" + " " + centralBalance.CheckingCashMoney());
	    System.out.println("Deposit or withdrawal? Choose one.");
	    String input = userInput2.nextLine();
	                if (input.equalsIgnoreCase("Deposit"))
	                    {
	                	String yesorno = "yes";
                        
	                	while (yesorno.equalsIgnoreCase("yes"))
	                	{
	                		System.out.print("Enter a sum to deposit: ");
	                        double deposit = userInput2.nextDouble();
	                        System.out.println("Your balance is now " + (centralBalance.CashMoney() - deposit));
	                        System.out.println("Your checking account's balance is now " + (deposit + centralBalance.CheckingCashMoney()));
	                        System.out.println("Would you like to deposit again? (yes or no)");
	                            yesorno = userInput3.nextLine();
	                                                    
	                    }
	                    }	          
	                if (input.equalsIgnoreCase("Withdraw") || input.equalsIgnoreCase("Withdrawal"))
	                	{
	                	 String yesorno2 = "yes";
	                	 while (yesorno2.equalsIgnoreCase("yes"))
	 		                    
	 		           {
	                    System.out.println("Enter a sum to withdraw");
	                    double newamount = userInput.nextDouble();
	                    user2.takeMoney(newamount);
	                    
	                        if (newamount > centralBalance.CashMoney())
	                            {
	                            System.out.println("You don't have enough money. You've been charged an overdraft fee.");
	                            System.out.println("Your checking account's balance is " + (centralBalance.CheckingCashMoney() - 20.00 - newamount));
	                            System.out.println("Your balance is " + (centralBalance.CashMoney() + newamount));
	                            System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
	                            }
	                        
	                        else 
	                        {
	                        	System.out.println("Your checking account's balance is " + (centralBalance.CheckingCashMoney() - newamount));
	                        	System.out.println("Your balance is " + (centralBalance.CashMoney() + newamount));
	                            System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
	                        }
	                        yesorno2 = userInput3.nextLine();
	                         
	 		           }
	                	}
	    
     }
}
    class Acc   {
        //default constructor
        public Acc()
        {
            double balance = 0;
			myBalance = balance;
        }
    
        //accessors
        public double getBalance(int acccountnumber)
        {
            return myBalance;
        }
        
        //setters
        public void setBalance(double money)
        {
            double balance = money;
        }
        public void depositMoney(double newamount)
        {
            myBalance = newamount + myBalance;
        }

         public void takeMoney(double newamount)
        {
            myBalance = myBalance - newamount;
        }
        
        public void MaintenanceFee()
        {
            balance = balance - 10.00;
        }
        
        public void OverdraftFee()
        {
            balance = balance - 20.00; 
        }
    private double myBalance = 0.00;
    private double balance;
    }


    