
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AutoTellerMachine{

	public static void main(String[] args){
		
		customerparse CP = new customerparse();
		customerparse.List<customer> list = list.getList();
	
		int scamaction;
		int thonk;
		Scanner userInput = new Scanner(System.in);
		Scanner userPINput = new Scanner(System.in);
		
		System.out.println("Welcome to Vito Bank's Premium ATM!");
		System.out.println("Enter your PIN Number here to access your account");
		
		String userPIN = userPINput.nextLine();
		boolean pinVerification =  false;
		while (pinVerification = false) {
			if (userPIN =userPIN  ){
				pinVerification = true;
			}
			else {
				System.out.println("That wasn't a valid PIN the program will now run infinitley good job idiot");
				// Else statement for people who are not part of the bank in the future.
			}
		}
		
		System.out.println("Hello again " + /*CustomerName*/  ", what sort of transaction would you like to do?");
		System.out.println("Enter 0 for Deposit, 1 for Withdrawal, 2 for Balance Inquiry, 3 for Transfers, 4 to literally burn money");
		thonk = userInput.nextInt();
		int stonks = 0;
		while (stonks == 0){
		if (thonk == 0) {
			ATMFunctions.Deposit();
			stonks++;
		}
		if (thonk == 1) {
			ATMFunctions.Withdrawal();
			stonks++;
		}
		if (thonk == 2){
			ATMFunctions.BalanceInquiry();
			/*CHANGE LATER*/
			stonks++;
		}
		if (thonk == 3){
			ATMFunctions.Transfer();
			
			stonks++;
			
		}
		if (thonk == 4){
			/*Burning money method here*/
			/*CHANGE LATER*/
			stonks++;
		}
		else{
			System.out.println("That was not a choice and you really messed up, prepare for account deletion (haha jk...unless)");
			
		}
	}
		
}

	public static class ATMFunctions{
		static int scamaction;
		static int brokeboi;
		static int bruh;
		static Scanner atmBtn = new Scanner(System.in);
		static Scanner transferScan = new Scanner(System.in);
		
	public static void Withdrawal(){
			
			System.out.println("Withdrawal Amounts:");
			System.out.println("1 - $10");
			System.out.println("2 - $20");
			System.out.println("3 - $50");
			System.out.println("4 - $100");
			System.out.println("5 - Custom Amount");
			System.out.println("Please enter 1-5 here");
			brokeboi = atmBtn.nextInt();
			if(brokeboi == 1 ) {
				System.out.println("Which Account would you like to withdraw from, 1 - Checking or 2 - Savings?");
				brokeboi = atmBtn.nextInt();
				if (brokeboi == 1){
					//CustomerChecking = CustomerChecking - 10;
					System.out.println("Your balance is now " /*customerchecking*/);
				}
				if (brokeboi == 2){
					//CustomerSavings = CustomerSavings -10;
					System.out.println("Your balance is now " /*customersaving*/);
				}
			}
			if(brokeboi == 2 ) {
				System.out.println("Which Account would you like to withdraw from, 1 - Checking or 2 - Savings?");
				brokeboi = atmBtn.nextInt();
				if (brokeboi == 1){
					//CustomerChecking = CustomerChecking - 20;
					System.out.println("Your balance is now " /*customerchecking*/);
				}
				if (brokeboi == 2){
					//CustomerSavings = CustomerSavings -20;
					System.out.println("Your balance is now " /*customersaving*/);
				}
			}
			if(brokeboi == 3 ) {
				System.out.println("Which Account would you like to withdraw from, 1 - Checking or 2 - Savings?");
				brokeboi = atmBtn.nextInt();
				if (brokeboi == 1){
					//CustomerChecking = CustomerChecking - 50;
					System.out.println("Your balance is now " /*customerchecking*/);
				}
				if (brokeboi == 2){
					//CustomerSavings = CustomerSavings - 50;
					System.out.println("Your balance is now " /*customersaving*/);
				}
			}
			if(brokeboi == 4 ) {
				System.out.println("Which Account would you like to withdraw from, 1 - Checking or 2 - Savings?");
				brokeboi = atmBtn.nextInt();
				if (brokeboi == 1){
					//CustomerChecking = CustomerChecking - 100;
					System.out.println("Your balance is now " /*customerchecking*/);
				}
				if (brokeboi == 2){
					//CustomerSavings = CustomerSavings - 100;
					System.out.println("Your balance is now " /*customersaving*/);
					
				}
			}
			if(brokeboi == 5 ) {
				System.out.println("How much would you like to withdraw?");
				System.out.println("Which Account would you like to withdraw from, 1 - Checking or 2 - Savings?");
				brokeboi = atmBtn.nextInt();
				if (brokeboi == 1){
					//CustomerChecking = CustomerChecking - 20;
				}
				if (brokeboi == 2){
					//CustomerSavings = CustomerSavings - 20;
				}
			}
			
			System.out.println("Withdrawal Complete! Your Balance is now "  /* + CustomerBalance*/);
			System.out.println("Would you like to perform another Transaction? Enter 0 for Yes, 1 for no, and 2 to end tranaction and to print your receipt");
			scamaction = atmBtn.nextInt(); 
			if (scamaction == 0) {
				System.out.println("What sort of Transaction would you like to Perform?");
				System.out.println("Enter 0 - Withdraw Again!, 1 - Deposit, 2 - Balance Inquiry, 3 - Transfers, 4- Burn Money");
				bruh = atmBtn.nextInt();
				if (bruh == 0){
					Withdrawal();
				}
				if (bruh == 1){
					Deposit();
				}
				if (bruh == 2){
					BalanceInquiry();
				}
				if (bruh == 3){
					Transfer();
				}
				if (bruh == 4){
					BurnMoney();
				}
				
			}
		}
	

	public static void Deposit(){
		System.out.println("How much money would you like to deposit?");
		//CustomerBalance = CustomerBalance + userInput.nextDouble();
		
		
	}
	
	public static void BalanceInquiry(){
		int balanceNum;
		boolean exit = false;
		
		System.out.println("What account would you like to check the balance of?");
		System.out.println("Enter 0 for Checking and 1 for Savings");
		
		balanceNum = atmBtn.nextInt();
		
		while(exit = false){
			if(balanceNum == 0) {
				System.out.println("You Checking account balance is: " /*CheckingBalance*/);
				exit = true;
			}
			if(balanceNum == 1) {
				System.out.println("Your Savings account balance is:" /*SavingsBalance*/);
				exit = true;
			}
			else {
				System.out.println("Hey, you can't do that!");
				System.out.println("I said enter 0 for Checking and 1 for Savings and you entered " + atmBtn + " which wasn't an option.");
				System.out.println("Enter 0 or 1 here :)");
				balanceNum = atmBtn.nextInt();
	
			}
		}
		
		System.out.println("Would you like to perform another Transaction?");
		System.out.println("Enter 0 for Deposit, 1 for Withdrawal, 2 for Balance Inquiry, 3 for Transfers, 4 to Burn Money");
		balanceNum = atmBtn.nextInt();
		if(balanceNum == 0) {
			Deposit();
		}
		if(balanceNum == 1) {
			Withdrawal();
		}
		if(balanceNum == 2) {
			BalanceInquiry();
		}
		if(balanceNum == 3) {
			Transfer();
		}
		if(balanceNum == 4) {
			BurnMoney();
		}
	}
	
	public static void Transfer() {
		
		
		System.out.println("Transfer Time!");
		System.out.println("Select which account you'd like to transfer money from, enter 0 for Checking and 1 for Savings");
		int transferNum = atmBtn.nextInt();
		Scanner transferScan = new Scanner(System.in);
		int transferAmount; 
		
		if(transferNum == 0) {
			
			System.out.println("How much money would you like to transfer to your savings account?");
			transferAmount = transferScan.nextInt();
			//CheckingBalance = CheckingBalance - transferAmount;
			//SavingBalance = SavingBalance + transferAmount;
			
		}
		if(transferNum == 1) {
			
			System.out.println("How much money would you like to transfer to your checking account?");
			transferAmount = transferScan.nextInt();
			//SavingsBalance = SavingsBalance - transferAmount;
			//CheckingBalance = CheckingBalance + transferAmount;
			
		}
		
		System.out.println("Would you like to perform another Transaction?");
		System.out.println("Enter 0 for Deposit, 1 for Withdrawal, 2 for Balance Inquiry, 3 for Transfers, 4 to Burn Money");
		transferNum = atmBtn.nextInt();
		if(transferNum == 0) {
			Deposit();
		}
		if(transferNum == 1) {
			Withdrawal();
		}
		if(transferNum == 2) {
			BalanceInquiry();
		}
		if(transferNum == 3) {
			Transfer();
		}
		if(transferNum == 4) {
			BurnMoney();
		}
	}
	
	public static void BurnMoney() {
		
		int burnMoneyNum;
		
		System.out.println("this method does nothing");
		System.out.println("Would you like to perform another Transaction?");
		System.out.println("Enter 0 for Deposit, 1 for Withdrawal, 2 for Balance Inquiry, 3 for Transfers, 4 to Burn Money");
		burnMoneyNum = atmBtn.nextInt();
		if(burnMoneyNum == 0) {
			Deposit();
		}
		if(burnMoneyNum == 1) {
			Withdrawal();
		}
		if(burnMoneyNum == 2) {
			BalanceInquiry();
		}
		if(burnMoneyNum == 3) {
			Transfer();
		}
		if(burnMoneyNum == 4) {
			BurnMoney();
		}
	}
}
}