//need Customer team to create accountnumbers to put in

//overdraft and maintenance fees
import java.util.Scanner;

public class Account {
     public static void main(String args[]) {
    
    Checking user = new Checking();
    System.out.println("Account number:" + " " + accountnumber);
    System.out.println("Balance:" + " " + user.getBalance(accountnumber);
    System.out.println("Deposit or withdrawal? Choose one.");
    
            Scanner x = new Scanner(System.in);
            String input = x.nextLine();
    
        for (int sentinel = 1; sentinel > 0)
        {
                if (input.equalsIgnoreCase("deposit"))
                    {
                        System.out.println("Enter a sum to deposit");
                        double deposit = x.nextDouble();
                        user.depositMoney(double deposit);
                            System.out.println("Action completed. Would you like to deposit again? (yes or no)");
                            String r = x.NextLine();
                            if (r.equalsIgnoreCase("no")
                                {
                                    int sentinel = -1;
                                }
                            
                    }
            
        }
                    
                    
            for (int sentinel2 = 1; sentinel2 > 0)
            {
                else 
                {
                    System.out.println("Enter a sum to withdraw");
                    double withdraw = x.nextInt();
                    user.takeMoney(double newamount);
                        System.out.println("Action completed. Would you like to withdraw again? (yes or no)");
                        String s = x.NextLine();
                        if (s.equalsIgnoreCase("no")
                            {
                                int sentinel2 = -1;
                            }
                        
                }
            }
    
    
    class Checking
    
    
    {
        //default constructor
        public Checking()
        {
            myCheckingMoney = 0.00;
        }
    
        //accessors
        public double getBalance(int acccountnumber)
        {
            return myCheckingMoney;
        }
        
        //setters
        public double depositMoney(double newamount)
        {
            myCheckingMoney = newamount + myCheckingMoney;
        }
    
         public double takeMoney(double newamount)
        {
            myCheckingMoney = myCheckingMoney - newamount;
        }
    private double myCheckingMoney = 0.00;
    }
    
    }
}
