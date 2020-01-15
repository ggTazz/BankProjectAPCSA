import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class customerparse { 
	
	static int rfid;

	static ArrayList<customer> list = new ArrayList<customer>(100);
	
	public static void login(){
		
		Scanner input = new Scanner(System.in);
		
		String enterUsername, name, address, username, password, enterPassword, mainPage, enter, words;
		int atmPin, answer, i = 0, xx, xy;
		double DOB, phoneNumber;
		
		//safeBoxes.sload();
		load(); //loads data
		
		
		do {
			
			System.out.println("Welcome to the Vito Bank!\n");
			System.out.println("(1) Sign in");
			System.out.println("(2) Create new account\n");
		
			answer = input.nextInt();
			input.nextLine();
		
			if (answer == 1) { //selects between two options
			
				System.out.print("\nUsername: ");
				enterUsername = input.nextLine();
			
				System.out.print("\nPassword: ");
				enterPassword = input.nextLine();		
				
				if (verify(enterUsername, enterPassword) == true) {
					System.out.println("\nSuccessfully logged in.\n");
					
					System.out.println("(1) Buy Safety Deposit Box");
					System.out.println("(2) Access Safety Deposit Box");
					System.out.println("(3) Go to the rest of the bank");
					
					answer = input.nextInt();
					
					if (answer == 1) {
						
						ArrayList<String> ran = new ArrayList<String>(100);
						
						System.out.println("\nDeposit (Item,Item,etc.)\n");
						
						enter = input.next();
						
						
						Scanner s = new Scanner(enter);
						s.useDelimiter("[,\n]");
						
						while(s.hasNext()) {
							words = s.next().trim();
							ran.add(words);
						}
						
						s.close();
						
						safeBoxes.addUser(enterUsername, ran);
						System.out.println("\nYour box number is " + (safeBoxes.saver.size() - 1) + " and your code is "
						+ safeBoxes.tempCode + "\n");
						
					}
					
					else if (answer == 2) {
						
						System.out.print("\nBox number: ");
						xx = input.nextInt();
					
						System.out.print("\nBox code: ");
						xy = input.nextInt();		
						
						if (safeBoxes.verifyboxID(xx, xy) == true) {
							System.out.println("\nBox Open\n");
							System.out.println(safeBoxes.saver.get(safeBoxes.g).getItems() + "\n");
						}
						else {
							System.out.println("\nBox combination incorrect\n");
						}
						
					}
					if (answer == 3) {
						Bank B = new Bank();
						B.banque();
					}
				}
				
				else {
					System.out.println("\nUsername or Password is Incorrect\n");
				}
			
			}

			else if (answer == 2) {
			
				System.out.print("\nName (First Last) : ");
				name = input.nextLine();
			
				System.out.print("\nAddress: ");
				address = input.nextLine();
			
				System.out.print("\nDOB (MMDDYYYY) : ");
				DOB = input.nextDouble();
			
				System.out.print("\nPhone Number (XXXXXXXXXX) : ");
				phoneNumber = input.nextDouble();
			
				System.out.print("\nAtm Pin: ");
				atmPin = input.nextInt();
						
				System.out.print("\nUsername: ");
				username = input.next();
						
				System.out.print("\nPassword: ");
				password = input.next();

				customer temp = new customer(name, address, DOB, phoneNumber, atmPin, username, password, 0, 0);
			
				list.add(i, temp);
				input.nextLine();
			
				i++;
				System.out.println("\nAccount created!");
				System.out.println("Please say N to save your account.");
				System.out.println();
				
			}
		
			System.out.println("Return to main page? (Y / N)");
			mainPage = input.next();
			System.out.println();
			
		} while(mainPage.equalsIgnoreCase("Y"));
		input.close();
		save();
		safeBoxes.ssave();
	}	
	
	public static void save() {
		
		BufferedWriter erase;
		try {
			erase = new BufferedWriter(new FileWriter("storage", false));
			erase.write("");
			erase.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		for (int i = 0; i < list.size(); i++) {
			
			DecimalFormat df = new DecimalFormat("#");
	        df.setMaximumFractionDigits(10);
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("storage", true));
				writer.write(list.get(i).getName() + "," + list.get(i).getAddress() + "," + df.format(list.get(i).getDOB()) + "," 
				+ df.format(list.get(i).getphoneNumber()) + "," + list.get(i).getAtmPin() + "," + list.get(i).getUsername() + "," 
				+ list.get(i).getPassword() + "," + list.get(i).getBalance() + "," + list.get(i).getsBalance());
				
				writer.newLine();
			
				writer.close();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
		}
		
	}
	
	public static void load() {
		
		String lname, laddress, lusername, lpassword;
		int latmPin, f = 0;
		double lDOB, lphoneNumber, lbalance, lsbalance;
		
		try {
			
			Scanner ink = new Scanner(new File("storage"));
			ink.useDelimiter("[,\n]");
			
			while(ink.hasNext()) {
			
				lname = ink.next().trim();
				laddress = ink.next().trim();
				lDOB = ink.nextDouble();
				lphoneNumber = ink.nextDouble();
				latmPin = ink.nextInt();	
				lusername = ink.next().trim();
				lpassword = ink.next().trim();
				lbalance = ink.nextDouble();
				lsbalance = ink.nextDouble();
			
				customer temp = new customer(lname, laddress, lDOB, lphoneNumber, latmPin, lusername, lpassword, lbalance, lsbalance);
				
				list.add(f, temp);
				f++;
				ink.nextLine();
			
			}
			
			ink.close();
			
		}
		
		catch(Exception e) {
			System.out.print("oops");
		}
		
	}
	public static boolean verify(String username, String password) {
		
		 for (rfid = 0; rfid < list.size(); rfid++) {
			 if (list.get(rfid).getUsername().compareTo(username) == 0 && list.get(rfid).getPassword().compareTo(password) == 0) {
				 return true;
			 }
		 }
		 
		 return false;
		
	}
	
}