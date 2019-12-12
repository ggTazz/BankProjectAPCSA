//***CODE NEEDS ACCOUNT NUMBERS / USERNAME AND PASSWORD TO BE PASSED IN TO WORK

import java.util.Scanner;

public class Account {
     public static void main(String args[]) {
    
    Checking user = new Checking();
    
 
    
        //need someone to set balance amounts using ussernames and passwords
       
        
        
    System.out.println("Account number:" + " " + accountnumber);
    System.out.println("Balance:" + " " + user.getBalance(accountnumber));
    System.out.println("Deposit or withdrawal? Choose one.");
    
            
            String input = x.nextLine();
    
        for (int sentinel = 1; sentinel > 0;)
        {
                if (input.equalsIgnoreCase("deposit"))
                    {
                        System.out.println("Enter a sum to deposit");
                        double deposit = x.nextDouble();
                        user.depositMoney(deposit);
                            System.out.println("Action completed. Would you like to deposit again? (yes or no)");
                            String r = x.NextLine();
                            if (r.equalsIgnoreCase("no"))
                                {
                                    int sentinel = -1;
                                }
                            
                    }
            
        }
                    
                
            for (int sentinel2 = 1; sentinel2 > 0;)
            {
                 if (input.equalsIgnoreCase("withdraw"))
                {
                    System.out.println("Enter a sum to withdraw");
                    double newamount = x.nextDouble();
                    user.takeMoney(newamount);
                    
                        if (newamount > balance)
                            {
                            System.out.println("You don't have enough money. You've been charged an overdraft fee.");
                            OverdraftFee();
                            }
                        
                        else 
                        {
                            System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
                        String s = x.NextLine();
                        if (s.equalsIgnoreCase("no"))
                            {
                                int sentinel2 = -1;
                            }
                        }
                        
                }
            }
        
        user.MaintenanceFee();
     }
     
}
    
    class Checking
    
    
    {
        //default constructor
        public Checking()
        {
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
            balance = money;
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
    }
    
  
