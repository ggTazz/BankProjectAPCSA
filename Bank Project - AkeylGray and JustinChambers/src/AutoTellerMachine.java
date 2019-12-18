
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AutoTellerMachine{

	public static void ATMlauncher(){
		/*
		customerparse CP = new customerparse();
		customerparse.List<customer> list = list.getList();
		*/
		int inputATM;
		int scamaction;
		int thonk;
		Scanner userInput = new Scanner(System.in);
		Scanner userPINput = new Scanner(System.in);
		System.out.println("Please type in your ATM Pin");
		inputATM = userInput.nextInt();
		if (inputATM == customer.getAtmPin()) {
			ATMMainMenu();
		}
	}
	public static void ATMMainMenu() {
		int inputATM;
		int scamaction;
		int thonk;
		Scanner userInput = new Scanner(System.in);
		Scanner userPINput = new Scanner(System.in);
		System.out.println("Welcome to Vito Bank's Premium ATM!");		
		System.out.println("Which would you like to access?");
		System.out.println("(1) Checking Account");
		System.out.println("(2) Savings Account");
		System.out.println("(3) Transfer Funds");
		System.out.println("(4) Burn Money :)");
		System.out.println("(5) Check Accounts Balance");
		thonk = userInput.nextInt();
		if (thonk == 1)
			CheckingAccount.checking();
		if (thonk == 2)
			CheckingAccount.savings();
		if (thonk == 3)
			ATMFunctions.Transfer();
		if (thonk == 4)
			ATMFunctions.BurnMoney();
		if (thonk == 5) {
			System.out.println("Your Checking Account balance is " + centralBalance.CheckingCashMoney());
			System.out.println("Your Savings Account balance is " + centralBalance.SavingsCashMoney());
			ATMMainMenu();
		}
	}
}

	class ATMFunctions{
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
		int depositnum;
		Scanner depositscan = new Scanner(System.in);
		double depositAmount;
			System.out.println("How much money would you like to deposit?");
			depositAmount = depositscan.nextDouble();
		System.out.println("Deposit Complete! Your Balance is now " + (centralBalance.CashMoney() + depositAmount));
		System.out.println("Would you like to perform another Transaction? Enter 0 for Yes, 1 for no");
		depositnum = atmBtn.nextInt(); 
		if (depositnum == 0) {
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
		if (depositnum == 1){
			
		}
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
		
		System.out.println("Would you like to perform another Transaction? Enter 0 for Yes, 1 for no");
		balanceNum = atmBtn.nextInt(); 
		if (balanceNum == 0) {
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
		if (balanceNum == 1){
			
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
			double totalChangeC = (centralBalance.CheckingCashMoney() - transferAmount);
			double totalChangeS = (centralBalance.SavingsCashMoney() +  transferAmount);
			System.out.println("Your checking account balance is " + totalChangeC);
			System.out.println("Your checking account balance is " + totalChangeS);
		}
		if(transferNum == 1) {
			
			System.out.println("How much money would you like to transfer to your checking account?");
			transferAmount = transferScan.nextInt();
			double totalChangeC = (centralBalance.CheckingCashMoney() + transferAmount);
			double totalChangeS = (centralBalance.SavingsCashMoney() -  transferAmount);
			System.out.println("Your checking account balance is " + totalChangeC);
			System.out.println("Your checking account balance is " + totalChangeS);
		}
		
		System.out.println("Would you like to perform another Transaction? Enter 0 for Yes, 1 for no");
		transferNum = atmBtn.nextInt(); 
		if (transferNum == 0) {
			Transfer();
		}
		if (transferNum == 1){
			AutoTellerMachine.ATMlauncher();
		}
	}
	
	public static void BurnMoney() {
		
		int burnMoneyNum;
		
		System.out.println("this method does nothing");
		AutoTellerMachine.ATMMainMenu();
	}
}