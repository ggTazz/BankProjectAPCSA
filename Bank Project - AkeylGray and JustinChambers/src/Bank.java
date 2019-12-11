//you can connect java files using the "extends" command in the public class.
//or by making it an object


import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;
import Employees.EmployeesData;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.*;

//ISSUES 12/9
//need to optimize code. I doubt copying and pasting code is what to do.
//Find a way to have the time update.

public class Bank{
	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		Scanner UserInput2 = new Scanner (System.in); 
		
		//Formula for branch number
		int maxBranchNumber = 100000000;
		int minBranchNumber = 0;
		int range = maxBranchNumber - minBranchNumber + 1;
		int branchNumber = (int)(Math.random() * range) + minBranchNumber;
		
	
		//Time
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
		
		//Page Selection 
				int loop = -99;
				
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("The time is " + time.format(formatter));
				System.out.println("Press Help for Commands.");
			while (loop == -99) {
				
				String page = UserInput2.nextLine();
			if (page.equalsIgnoreCase("Home")) {
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("The time is " + time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
				
			if (page.equalsIgnoreCase("Accounts")) {
				System.out.println("Do you want to create a Checking or Savings Account?");
				String AccountDecision = UserInput.nextLine();
					if(AccountDecision.equalsIgnoreCase("Checking") || AccountDecision.equalsIgnoreCase("Checking Account")) {
						System.out.println("Checking Account"); //Placeholder
						System.out.println("Please type the name of the page you wish to go to.");
						System.out.println("The time is " + time.format(formatter));
						System.out.println("Press Help for Commands.");
					}
					if(AccountDecision.equalsIgnoreCase("Savings") || AccountDecision.equalsIgnoreCase("Savings Account")) {
						System.out.println(Savings.getAccountNumber());
						System.out.println("Please type the name of the page you wish to go to.");
						System.out.println("Press Help for Commands.");
					}
				}
			if (page.equalsIgnoreCase("ATM")) {
				System.out.println(TheBank.ATM());
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Customer")) {
				System.out.println(TheBank2.Customer());
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Papa John")) {
				System.out.println(TheBank.getPPP());
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Mom Gat")) {
				System.out.println(TheBank.getMomGat());
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Investment")) {
				System.out.println(HedgeFunds.HF);
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Employee Data")) {
				System.out.println(Employees.ED);
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println(time.format(formatter));
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Time")) {
				System.out.println("The time is " + time.format(formatter));
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("Press Help for Commands.");
			}
			if (page.equalsIgnoreCase("Help")) {
				System.out.println("Accounts - Takes you to the Accounts page.");
				System.out.println("Employee Data - Takes you to the Employees page.");
				System.out.println("Papa John - Pizza Pasta BB.");
				System.out.println("ATM - Takes you to the ATM page.");
				System.out.println("Home -  Takes you back to the main menu.");
				System.out.println("Investment -  Takes you to the Investment Page.");
				System.out.println("Time - What do you think?");
				System.out.println("End,Exit,Stop - What do you think?");
				System.out.println(" ");
				System.out.println("Please type the name of the page you wish to go to.");
			}
			
			if (page.equalsIgnoreCase("End") || page.equalsIgnoreCase("Exit") || page.equalsIgnoreCase("Stop"))
				break;
			}
		
		
		//SEPERATE CLASSES(Mostly Test Classes)
	}
	static class TheBank extends Test{
		public static double ATM() {
			return Test.testNumber4;
		}
		public static int getAccounts(){
			return Test.testNumber2;
	}
		public static int getPPP() {
			return Test.testNumber;
		}
		public static String getMomGat() {
			return Test.hi;
		}
	}
	static class TheBank2 extends Test2{
		public static int Customer(){
			return Test2.testNumber3;
		}
		public static double bebop() {
			return Test2.volume;
		}
	}
		
	//EMPLOYEES (WIP)
	static class Employees{
	static EmployeesData ED = new EmployeesData();{
			
	}
	}
	
	//INVESTMENT
	//Trying to find a way to shorten/optimize code.
	//Don't invest for 1000 years!
	static class HedgeFunds{
		static HedgeFunds HF = new HedgeFunds();{
			Scanner in = new Scanner(System.in); 
		    System.out.print("  <><><>Welcome To The Investment Division!<><><>  \n");
		    System.out.print("Input the amount you wish to invest: $");  //Input the amount you wish to invest
		 	double investment = in.nextDouble();
			double rate = 0.2;
			System.out.print("Input number of years you wish to invest: ");  //Input the # of years you wish to invest
			int year = in.nextInt();
			
			rate *= 0.2;
			
			System.out.println("Year(s)         FutureValue");
			for(int i = 1; i <= year; i++) {
		    	int formatter = 19;
			    if (i >= 10) formatter = 18;
				System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
		       }
		}
		public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		}
	}
	
	//ACCOUNTS (WIP)
	static class Accounts{
		static Savings SA = new Savings();{
			double balance = 100;
			String accountNumber;
			double withdrawl;
			double deposit;
			System.out.println(Savings.savingsAccount());
		}
	}
}
	
	
	
	

