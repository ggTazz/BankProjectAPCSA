import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class customerparse { 

	static ArrayList<customer> list = new ArrayList<customer>(100);
	
	public static void main( String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int answer;
		String enterUsername;
		String enterPassword;
		String name, address, username, password;
		int atmPin;
		double DOB, phoneNumber;
		int i = 0;
		String mainPage;
		
		load();
		
		do {
		
			System.out.println("Welcome to the bank.\n");
			System.out.println("(1) Sign in");
			System.out.println("(2) Create new account\n");
		
			answer = input.nextInt();
			input.nextLine();
		
			if (answer == 1) {
			
				System.out.print("\nUsername: ");
				enterUsername = input.nextLine();
			
				System.out.print("\nPassword: ");
				enterPassword = input.nextLine();		
				
				if (verify(enterUsername, enterPassword) == true) {
					System.out.println("\nSuccessfully logged in.\n");
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

				customer temp = new customer(name, address, DOB, phoneNumber, atmPin, username, password);
			
				list.add(i, temp);
				input.nextLine();
			
				i++;
				
				System.out.println("\nAccount created!");
				System.out.println();
				
			}
		
			System.out.println("Return to pain page? (Y / N)");
			mainPage = input.next();
			System.out.println();
			
		} while(mainPage.equalsIgnoreCase("Y"));
	
		input.close();
		save();
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
				+ list.get(i).getPassword());
				
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
		double lDOB, lphoneNumber;
		
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
			
				customer temp = new customer(lname, laddress, lDOB, lphoneNumber, latmPin, lusername, lpassword);
			
				list.add(f, temp);
				f++;
				ink.nextLine();
			
			}
			
			ink.close();
			
		}
		
		catch(Exception e) {
			
		}
		
	}
	
	public static boolean verify(String username, String password) {
		
		 for (int g = 0; g < list.size(); g++) {
			 if (list.get(g).getUsername().compareTo(username) == 0 && list.get(g).getPassword().compareTo(password) == 0) {
				 return true;
			 }
		 }
		 
		 return false;
		
	}
	
}

class customer {
	
	public customer() {
		
		myName = "";
		myAddress = "";
		myDOB = 0;
		myphoneNumber = 0;
		myatmPin = 0;
		myUsername = "";
		myPassword = "";
		
	}

	public customer(String name, String address, double DOB, double phoneNumber, int atmPin, String username, String password) {
		
		myName = name;
		myAddress = address;
		myDOB = DOB;
		myphoneNumber = phoneNumber;
		myatmPin = atmPin;
		myUsername = username;
		myPassword = password;
		
	}
	
	//getter setter open
	
	public String getName() {
		return myName;
	}
	public void setName(String Name) {
		myName = Name;
	}
	public String getAddress() {
		return myAddress;
	}
	public void setAddress(String address) {
		myAddress = address;
	}
	public double getDOB() {
		return myDOB;
	}
	public void setDOB(double DOB) {
		myDOB = DOB;
	}
	public double getphoneNumber() {
		return myphoneNumber;
	}
	public void setphoneNumber(double phoneNumber) {
		myphoneNumber = phoneNumber;
	}
	public int getAtmPin() {
		return myatmPin;
	}
	public void setAtmPin(int atmPin) {
		myatmPin = atmPin;
	}
	public String getUsername() {
		return myUsername;
	}
	public void setUsername(String username) {
		myUsername = username;
	}
	public String getPassword() {
		return myPassword;
	}
	public void setPassword(String password) {
		myPassword = password;
	}
	
	//getter setter close
	
	private String myName, myAddress, myUsername, myPassword;
	private int myatmPin;
	private double myDOB, myphoneNumber;
	
}