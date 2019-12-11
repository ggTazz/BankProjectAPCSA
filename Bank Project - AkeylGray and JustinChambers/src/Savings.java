import java.util.Scanner;
import java.util.HashMap;
public class Savings
{
   
    // Class Variables
    private static double balance = 100;
    private static String accountNumber;
    private static double withdrawl;
    private static double deposit;
    
     // Create new Scanner object
    private static Scanner myscanner = new Scanner(System.in);

    // Accounts in the Bank
    //private String[] accounts = new String[10];
    private static String[] accounts = {"12345", "45678"};
    
    // Create a hashmap to store accounts and balance
    private static HashMap<String, Double> accountBalance = new HashMap<String, Double>();

    
            

    // Execution Method
    public static void main(String[] args) {
        accountBalance.put(new String("12345"), new Double(100));
        accountBalance.put(new String("45678"), new Double(200));
        
        boolean isValid = true;
        // do savings account action till user exits or completes any valid action
        while(isValid){
            isValid = savingsAccount();
        }
        
        if(!isValid){
            System.out.println("***** THANK YOU ... HAVE A NICE DAY*****");
        }
        
    }
    
    // SAVINGS Account Actions:
    public static boolean savingsAccount(){
        
        boolean savingsAccountActionInvalid = false;
        accountNumber = getAccountNumber();
        boolean accountExist = checkAccountExists(accountNumber);
        if(!accountExist){
            System.out.println("Account Number " + accountNumber +  " does not exist");
            savingsAccountActionInvalid = true;
        } 
        else {

            String userChoice = getAction();
            if(userChoice.equals("D") || userChoice.equals("d"))
            {
                System.out.println("Your current balance is: " + getAccountBalance(accountNumber));
                setDeposit(accountNumber);
                System.out.println("Your new balance is: " + getAccountBalance(accountNumber));
            }
            else if(userChoice.equals("W") || userChoice.equals("w"))
            {
                if(getAccountBalance(accountNumber) == 0){
                    System.out.println("No money in your account to withdraw");
                }
                else{
                    System.out.println("Your current balance is: " + getAccountBalance(accountNumber));
                    setWithdrawal(accountNumber);
                    System.out.println("Your new balance is: " + getAccountBalance(accountNumber));
                }
            }
            else if(userChoice.equals("B") || userChoice.equals("b"))
            {
                System.out.println("Your current balance is: " + getAccountBalance(accountNumber));
            }
            else if(userChoice.equals("E") || userChoice.equals("e")){
                System.out.println("***** THANK YOU ... HAVE A NICE DAY*****");
            }
            else{
                System.out.println("invalid entry");
                savingsAccountActionInvalid = true;
            }
 
         }
         return savingsAccountActionInvalid;
        
    }


    // 1. Get Account Number from Customer
    public static String getAccountNumber(){
       System.out.print("Enter Account Number: ");
       String enteredAccountNumber = myscanner.nextLine();
       return enteredAccountNumber;
    }

    // 2. Check Account Number exists
    public static boolean checkAccountExists(String accountNumber){
       boolean accountExist = false;
       // Code for account status check
       for(int i=0; i< accounts.length; i++){
           String accountinBank = accounts[i];
           if(accountinBank.equals(accountNumber)){
               accountExist = true;
               break;
           }
       }
       
       return accountExist;
    }
    
    // 3. Get action from Customer
    public static String getAction(){
       System.out.print("Enter D for deposit or W for withdrawl or B for balance or E for exit: " );
       String enteredAccountAction = myscanner.nextLine();
       return enteredAccountAction;
    }

    // 4. Show Account Balance to Customer
    public static double getAccountBalance(String accountNumber)
    {
       
        return accountBalance.get(accountNumber);
    }
    
    // 5. Accept deposit
    public static void setDeposit(String accountNumber)
    {
        System.out.print("Enter deposit amount : " );
        double enteredDepositAmount = myscanner.nextDouble();
        balance = balance + enteredDepositAmount;
        accountBalance.put(accountNumber, new Double(balance));
    
    }
    
     // 6. Do Withdrawal
    public static boolean setWithdrawal(String accountNumber)
    {
            boolean withdrawNotAvailable = false;
            System.out.print("Enter withdrawl amount : " );
            double enteredWithdrawlAmount = myscanner.nextDouble();
            // check if the enteredWithdrawlAmount > balance, if so cannot withdraw that amount
            if (enteredWithdrawlAmount > balance){
                withdrawNotAvailable = true;
                System.out.print("You do not have enough money " );
            }
            else{
                balance = balance - enteredWithdrawlAmount;
                accountBalance.put(accountNumber, new Double(balance));
            }
            return withdrawNotAvailable;
    }

 
}