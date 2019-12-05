//Customer Team needs to make OBJECT VARIABLES for each customer

import java.util.Scanner;
public class AutoTellerMachine {
	public static void main(String[] args){
		
		int scamaction;
		Scanner userInput = new Scanner(System.in);
		Scanner userPINput = new Scanner(System.in);
		
		System.out.println("Welcome to Vito Bank's Premium ATM!");
		System.out.println("Enter a your PIN Number here to access your account");
		
		String userPIN = userPINput.nextLine();
		boolean pinVerification =  false;
		while (pinVerification = false) {
			if (ArrayList.contains(userPIN)){
				pinVerification = true;
			}
			else {
				System.out.println("That wasn't a valid PIN the program will now run infinitley good job idiot");
			}
		}
		
	}
	public class ATMFunctions{
		
		static void Withdrawal(){
			
			/*CustomerBalance*/ = /*CustomerBalance*/ - userInput.nextDouble();
			System.out.println("Withdrawal Complete! Your Balance is now " + /*CustomerBalance*/);
			System.out.println("Would you like to perform another Transaction? Enter 0 for Yes, 1 for no, and 2 to end tranaction and to print your receipt");
			scamaction = userInput.nextInt(); 
			if (scamaction = 0) {
				System.out.println("What sort of Transaction would you like to Perform?");
			}
		}
		static void Deposit(){
			
			/*CustomerBalance*/ = /*CustomerBalance*/ + userInput.nextDouble();
		}
	}
		
		


}
