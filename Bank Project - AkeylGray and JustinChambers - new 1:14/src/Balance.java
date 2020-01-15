import java.util.Scanner;

public class Balance {

	public static void active(){
		
		Scanner input = new Scanner(System.in);
		int num;
		double change;
		
		System.out.println("Checking Account Balance: " + customerparse.list.get(customerparse.rfid).getBalance());
		System.out.println("Savings Account Balance: " + customerparse.list.get(customerparse.rfid).getsBalance());
		
		System.out.println("\nSelect an account\n\n(1)Checking\n(2)Saving");
		
		num = input.nextInt();
		
		if(num == 1) {
			
			System.out.println("\nWhat would you like to do\n\n(1)Transfer to Savings\n(2)Withdraw money\n(3)Deposit money");
			
			num = input.nextInt();
			
			if(num == 1) {
				System.out.println("Enter amount to transfer to Savings");			
				change = input.nextDouble();				
				transfer(2, change);
				System.out.println("Success!");
				customerparse.list.get(customerparse.rfid).overdraftProt();
			}
			else if(num == 2) {
				System.out.println("Enter amount to withdraw from Checking");
				change = input.nextDouble();
				customerparse.list.get(customerparse.rfid).minusBalance(change);
				System.out.println("Success!");
			}
			else if(num == 3) {
				System.out.print("Enter amount to deposit into Checking");
				change = input.nextDouble();
				customerparse.list.get(customerparse.rfid).addBalance(change);
				System.out.println("Success!");
				customerparse.list.get(customerparse.rfid).overdraftProt();
			}
			
		}
		else if(num == 2) {
			
			System.out.println("\nWhat would you like to do\n\n(1)Transfer to Checking\n(2)Withdraw money\n(3)Deposit money");
			
			num = input.nextInt();
			
			if(num == 1) {
				System.out.println("Enter amount to transfer to Checking");			
				change = input.nextDouble();				
				transfer(1, change);
				System.out.println("Success!");
				customerparse.list.get(customerparse.rfid).overdraftProt();
			}
			else if(num == 2) {
				System.out.println("Enter amount to withdraw from Saving");
				change = input.nextDouble();
				customerparse.list.get(customerparse.rfid).minussBalance(change);
				System.out.println("Success!");
			}
			else if(num == 3) {
				System.out.println("Enter amount to deposit into Checking");
				change = input.nextDouble();
				customerparse.list.get(customerparse.rfid).addsBalance(change);
				System.out.println("Success!");
				customerparse.list.get(customerparse.rfid).overdraftProt();
			}
			
		}
		customerparse.save();
		Bank.banque();
		
		
	}
	
	public static void transfer(int i, double change) {
		if(i == 1) {
			customerparse.list.get(customerparse.rfid).minussBalance(change);
			customerparse.list.get(customerparse.rfid).addBalance(change);
		}
		else if(i == 2) {
			customerparse.list.get(customerparse.rfid).minusBalance(change);
			customerparse.list.get(customerparse.rfid).addsBalance(change);
		}
	}
	
}
