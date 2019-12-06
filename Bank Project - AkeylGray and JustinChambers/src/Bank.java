//you can connect java files using the "extends" command in the public class.
//or by making it an object
//make back button

import java.util.Scanner;
import Employees.EmployeesData;

import java.io.FileNotFoundException;
import java.lang.Math;

//ISSUES 12/4
//Having a hard time importing another class

public class Bank{

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		Scanner UserInput2 = new Scanner (System.in); 
		
		//Formula for branch number
		int maxBranchNumber = 100000000;
		int minBranchNumber = 0;
		int range = maxBranchNumber - minBranchNumber + 1;
		int branchNumber = (int)(Math.random() * range) + minBranchNumber;
		
		/*
		 //Selection
		int select = 0;
		System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
		System.out.println("Press Enter to Start!");
		try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
		select = 1;
		if (select == 1); {
		System.out.println("What do you want to do?");
		System.out.println("Press 1 for Account Information. Press 2 for Employee Data.");
		//ISSUE When choosing an option, it displays both options regardless. 
		int input = UserInput2.nextInt();
			if (input == 1);{
				System.out.println(TheBank.getAccounts());
				select = 2;
			}
			if (input ==  2);{
				System.out.println(Employees.ED);
				select = 2;
			}
		}
		*/
		
		//Page Selection 
				int loop = -99;
				
				System.out.println("JoeStromboli");
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("Press Help for Commands.");
			while (loop == -99) {
				
				String page = UserInput2.nextLine();
			if (page.equalsIgnoreCase("Home")) {
				System.out.println("JoeStromboli");
				System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
				System.out.println("Press Enter to Start!");
				try{        System.in.read();}catch(Exception e){   e.printStackTrace();}
				System.out.println("Please type the name of the page you wish to go to.");
				System.out.println("Press Help for Commands.");
			}
				
			if (page.equalsIgnoreCase("Accounts")) {
				System.out.println(TheBank.getAccounts());
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("ATM")) {
				System.out.println(TheBank.ATM());
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("Customer")) {
				System.out.println(TheBank2.Customer());
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("Papa John")) {
				System.out.println(TheBank.getPPP());
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("getStuff")) {
				System.out.println(TheBank.getMomGat());
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("Employee Data")) {
				System.out.println(Employees.ED);
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("Help")) {
				System.out.println("Accounts - Takes you to the Accounts page.");
				System.out.println("Employee Data - Takes you to the Employees page.");
				System.out.println("Papa John - Pizza Pasta BB.");
				System.out.println("ATM - Takes you to the ATM page.");
				System.out.println("Home -  Takes you back to the main menu.");
				System.out.println("End,Exit,Stop - What do you think?");
				System.out.println(" ");
				System.out.println("Please type the name of the page you wish to go to.");
			}
			if (page.equalsIgnoreCase("End") || page.equalsIgnoreCase("Exit") || page.equalsIgnoreCase("Stop"))
				break;
			}
		
		
		
		//OUTPUTs
		//System.out.println(TheBank.getAccounts());
		//System.out.println(TheBank.ATM());
		//System.out.println(TheBank2.Customer());
		//System.out.println(TheBank.getPeepeePooPoo());
		//System.out.println(TheBank.getMomGat());
		//System.out.println(TheBank2.pepop());						
		//System.out.println(System.currentTimeMillis());
		
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
		//EMPLOYEES
	static class Employees{
	static EmployeesData ED = new EmployeesData(); {
			try {
				ED.FileNotFoundException();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ED.getInfo(ED.sc, ED.key);
	}
	}
}


