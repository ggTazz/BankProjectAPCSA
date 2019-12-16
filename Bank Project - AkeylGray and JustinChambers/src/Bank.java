//you can connect java files using the "extends" command in the public class.
//or by making it an object


import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;
import Employees.EmployeesData;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.*;

//ISSUES 12/14
//implement ATM
//implement Checking Accounts
//Fix multiple accounts
//Fix SDB working

public class Bank{
	public static void main(String[] args) {
		Clock C = new Clock();
		customerparse CP = new customerparse();{
			CP.login();
		}
	}
	public static void banque() {
		Scanner UserInput = new Scanner(System.in);
		Scanner UserInput2 = new Scanner (System.in); 
		
		//Formula for branch number
		int maxBranchNumber = 100000000;
		int minBranchNumber = 0;
		int range = maxBranchNumber - minBranchNumber + 1;
		int branchNumber = (int)(Math.random() * range) + minBranchNumber;
			
		//Page Selection 
				int loop = -99;
				
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			while (loop == -99) {
				
				String page = UserInput2.nextLine();
			if (page.equalsIgnoreCase("Home")) {
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
				
			if (page.equalsIgnoreCase("Accounts")) {
				System.out.println("Do you want to create a Checking or Savings Account?");
				String AccountDecision = UserInput.nextLine();
					if(AccountDecision.equalsIgnoreCase("Checking") || AccountDecision.equalsIgnoreCase("Checking Account")) {
						Account A = new Account();
						{
							Account.launcher();
						}
						System.out.println("Please type the name of the page you wish to go to.");
						System.out.print("The time is ");
						Clock.clocck();
						System.out.println("Press Help for Commands.");
					}
					if(AccountDecision.equalsIgnoreCase("Savings") || AccountDecision.equalsIgnoreCase("Savings Account")) {
						String accountNumber =  Savings.accountNumber;
						Savings SA = new Savings();
						{
							Savings.Functions();
						}
						System.out.println("Please type the name of the page you wish to go to.");
						System.out.println("Press Help for Commands.");
					}
				}
			if (page.equalsIgnoreCase("ATM")) {
				//AutoTellerMachine ATM = new AutoTellerMachine();
				//AutoTellerMachine.launcher();
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Customer")) {
				
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Loan")) {
				LoanDepartmentBank LDP = new LoanDepartmentBank();
			
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Investment")) {
				System.out.println("Do you wish to buy/sell Stock, or invest money?");
				String AccountDecision = UserInput.nextLine();
				if(AccountDecision.equalsIgnoreCase("Buy") || AccountDecision.equalsIgnoreCase("Buy Stock")){
					StocksBonds IS = new StocksBonds();{
						IS.firstQuestions();
					}
				}
				if(AccountDecision.equalsIgnoreCase("Sell") || AccountDecision.equalsIgnoreCase("Sell Stock")){
					SellBonds SQ = new SellBonds();{
						SQ.secondQuestions();
						//If the year is equal to eachother us
						//Add another variable for BuyYear and SellYear
					}
				}
				if(AccountDecision.equalsIgnoreCase("Invest Money")  || AccountDecision.equalsIgnoreCase("Invest")) {
					HedgeFunds HF = new HedgeFunds();
					HedgeFunds.function();
				}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Employee Data")) {
				EmployeesDetails ED = new EmployeesDetails();{
					EmployeesDetails.launcher();
				}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Time")) {
				System.out.print("The time is ");
				Clock.clocck();
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Help")) {
				System.out.println("Accounts - Takes you to the Accounts page.");
				System.out.println("Employee Data - Takes you to the Employees page.");
				System.out.println("ATM - Takes you to the ATM page. (NOT DONE)");
				System.out.println("Home -  Takes you back to the main menu.");
				System.out.println("Investment -  Takes you to the Investment Page.");
				System.out.println("Time - What do you think?");
				System.out.println("Log Out, End, Stop - What do you think?");
				System.out.println(" ");
				System.out.println("Please type the name of the page you wish to go to.");
			}
			
			if (page.equalsIgnoreCase("End") || page.equalsIgnoreCase("Stop") || page.equalsIgnoreCase("Log Out"))
				break;
			}
	}
}
	


	
	
	
	

