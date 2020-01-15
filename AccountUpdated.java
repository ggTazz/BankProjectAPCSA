import java.util.ArrayList;

import java.util.Scanner;

public class AccountUpdated {
    
    static ArrayList<customer> list = new ArrayList<customer>(100);
    
     public static void launcher() {
    
    Savings user = new Savings();
    Checking user2 = new Checking();
    
    
    
 
    
        //need someone to set balance amounts using ussernames and passwords
       
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);
    
    //System.out.println("Account number:" + " " + Savings.accountNumber);
    System.out.println("(1) Go to your Savings Account");
    System.out.println("(2) Go to your Checking Account");
   
    int accNDecision = userInput.nextInt();
    	if (accNDecision == 1) {
    		System.out.print("Enter in your account number: ");
		    String enterUsername = userInput.nextLine();
		    String enterPassword = userInput.nextLine();
		    
		    if (verify(enterUsername, enterPassword) == true) {
		     
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
		                	    
		                	    String yesorno2 = "yes";
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
		            
		        
		        user2.MaintenanceFee();
		     }
		      
    
    	}
        if (accNDecision == 2)
        {
           System.out.print("Enter in your account number: ");
		    int accountNumber = userInput.nextInt();
		  
		         if (verify(enterUsername, enterPassword) == true) { 
		    
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
			                        user2.setBalance(deposit);
			                            System.out.println("Action completed. Would you like to deposit again? (yes or no)");
			                            yesorno = userInput2.nextLine();
			                                                    
			                    }
		            
		                    }	           
		                if (input.equalsIgnoreCase("Withdraw"))
		                	{
		                	    
		                	    String yesorno2 = "yes";
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
        else System.out.println("Incorrect username and/or password");
	}
	
}//these two close the main method and class (keep track of braces)
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
