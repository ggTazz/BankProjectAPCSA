/******************************************************************************

                            Savings account

*******************************************************************************/

import java.util.Scanner;
public class SavingsAccount
{
   
    // Class Variables
    private double balance;
private String accountNumber;
private double withdrawl;
private double accountBalance, deposit;

// Accounts in the Bank
//private String[] accounts = new String[10];
private String[] accounts = {"12345", "45678"};


// Execution Method
public static void main(String[] args) {
   accountNumber = getAccountNumber();
System.out.println("Account Number is: " + accountNumber);
}


// 2. Check Account Number exists

// 4. Show Account Balance to Customer
// 5. Accept deposit
// 6. Do Withdrawal

// 1. Get Account Number from Customer
public static String getAccountNumber(){
   // Create new Scanner object
   Scanner myscanner = new Scanner(System.in);
   System.out.print("Enter Account Number: ");
        String enteredAccountNumber = myscanner.nextLine();
        return enteredAccountNumber;
}

// 2. Check Account Number exists
public static boolean checkAccountExists(String accNr){
   boolean accountExist = false;
   // Code for account status check
   
   return accountExist;
}

// 3. Add new Account
public static void setAccountNumber(String accNr){
   
}

 


}