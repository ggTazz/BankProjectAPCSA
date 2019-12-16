import java.util.Scanner;

public class Account {
     public static void launcher() {
    
    Savings user = new Savings();
    Checking user2 = new Checking();
    int balance = 100;
    int newAccountNumber;
    
 
    
        //need someone to set balance amounts using ussernames and passwords
       
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);
    
    //System.out.println("Account number:" + " " + Savings.accountNumber);
    System.out.println("(1) Go to your Checking Account");
    System.out.println("(2) Make a new account");
    int accNDecision = userInput.nextInt();
    	if (accNDecision == 1) {
    		System.out.print("Enter in your account number: ");
		    int accountNumber = userInput.nextInt();
		    if((accountNumber == 12345) || (accountNumber == 45678)) {
		    System.out.println("Your balance is:" + " " + balance);
		    System.out.println("Deposit or withdrawal? Choose one.");
		    	String input = userInput2.nextLine();
		                if (input.equalsIgnoreCase("Deposit"))
		                    {
		                        String yesorno = "yes";
		                        
			                	while (yesorno.equalsIgnoreCase("yes"))
			                	{
			                		System.out.print("Enter a sum to deposit: ");
			                        double deposit = userInput2.nextDouble();
			                        user.setDeposit(Savings.accountNumber);
			                            System.out.println("Action completed. Would you like to deposit again? (yes or no)");
			                            yesorno = userInput2.nextLine();
			                                                    
			                    }
		            
		                    }	           
		                if (input.equalsIgnoreCase("Withdraw"))
		                	{
		                	 while (yesorno2.equalsIgnoreCase("yes"))
		 		                    
		 		           {
		                    System.out.println("Enter a sum to withdraw");
		                    double newamount = userInput.nextDouble();
		                    user2.takeMoney(newamount);
		                    
		                        if (newamount > balance)
		                            {
		                            System.out.println("You don't have enough money. You've been charged an overdraft fee.");
		                            user2.OverdraftFee();
		                            }
		                        
		                        else 
		                        {
		                            System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
		                        }
		                        yesorno2 = userInput.nextLine();
		                        
		                        
		                        }
		                        
		                }
		            }
		        
		        user2.MaintenanceFee();
		     }
		     } 
    	if (accNDecision == 2) {
    		int maxBranchNumber = 100000;
    		int minBranchNumber = 0;
    		int range = maxBranchNumber - minBranchNumber + 1;
    		newAccountNumber = (int)(Math.random() * range) + minBranchNumber;
    		System.out.println("Your new account number is " + newAccountNumber);
    	}
	}
	}
    
    class Checking
    
    
    {
        //default constructor
        public Checking()
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
