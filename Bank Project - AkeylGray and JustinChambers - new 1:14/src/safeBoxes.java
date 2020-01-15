import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class safeBoxes {

	public safeBoxes() {
		myboxNumber = 0;
		myboxCode = 0;
	}
	
	public safeBoxes(String userID, int boxNumber, int boxCode, ArrayList<String> items) {
		myboxNumber = boxNumber;
		myboxCode = boxCode;
		myItems = items;
		myuserID = userID;
	}
	
	public int getboxNumber() {
		return myboxNumber;
	}
	public void setboxNumber(int boxNumber) {
		myboxNumber = boxNumber;
	}
	public int getboxCode() {
		return myboxCode;
	}
	public void setboxCode(int boxCode) {
		myboxCode = boxCode;
	}
	public String getuserID() {
		return myuserID;
	}
	public void setuserID(String userID) {
		myuserID = userID;
	}	
	public ArrayList<String> getItems() {
		return myItems;
	}
	public void setItems(ArrayList<String> items) {
		myItems = items;
	}

	public static void addUser(String userID, ArrayList<String> items) {

		tempCode = random.nextInt(900) + 100;
		
		safeBoxes temp = new safeBoxes(userID, saver.size(), tempCode, items);
		
		saver.add(r, temp);
		
	}
	
	public static boolean verifyboxID(int username, int password) {
		 for (g = 0; g < saver.size(); g++) {
			 if (saver.get(g).getboxCode() == password && saver.get(g).getboxNumber() == username) {
				 return true;
			 }
		 }
		 
		 return false;
		
	}
	
	public static void sload() {
		
			String luserID;
			int lboxNumber, lboxCode, f = 0;
		
			try {
			
				Scanner tink = new Scanner(new File("SafeBoxData"));
				Scanner rink = new Scanner(new File("SafeBoxData"));
				tink.useDelimiter("[,\n]");
				rink.useDelimiter("[,\n]");
				
				while(tink.hasNext()) {
					
					ArrayList<String> litems = new ArrayList<String>();
					int j = 0;
					luserID = tink.next().trim();
					lboxNumber = tink.nextInt();
					lboxCode = tink.nextInt();
					
					//System.out.println(luserID + lboxNumber + lboxCode);
					
					rink.next();
					rink.next();
					rink.next();
					
					while(j == 0) {
						
						if (rink.hasNextInt() == true) {
							j = 1;;
						}
						else if (rink.hasNext() == true){
							litems.add(rink.next());
						}
						else {
							j = 1;
						}
						//System.out.println(litems);
					}
					
					safeBoxes temp = new safeBoxes(luserID, lboxNumber, lboxCode, litems);
					
					saver.add(f, temp);
					f++;
					tink.nextLine();
					rink.nextLine();
					
				}
				tink.close();
				rink.close();	
			}
		
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public static void ssave() {
		
		ArrayList<String> rand = new ArrayList<String>();
		String itemizedString = "";
		BufferedWriter erase;
		try {
			erase = new BufferedWriter(new FileWriter("SafeBoxData", false));
			erase.write("");
			erase.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < saver.size(); i++) {
			
			try {
				rand = saver.get(i).getItems();
				for (int z = 0; z < rand.size(); z++) {
					itemizedString = itemizedString + "," + rand.get(z);
				}
			
			}
			catch(NullPointerException e) 
	        { 
	        
	        }
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("SafeBoxData", true));
				writer.write(saver.get(i).getuserID() + "," + saver.get(i).getboxNumber() + "," + saver.get(i).getboxCode()
				 + itemizedString);
				
				writer.newLine();
			
				writer.close();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
			itemizedString = "";
		}
		
	}	
	
	private int myboxNumber, myboxCode;
	public static int r = 0, g;
	public static int tempCode;
	private String myuserID;
	private  ArrayList<String> myItems = new ArrayList<String>(100);
	public static ArrayList<safeBoxes> saver = new ArrayList<safeBoxes>(100);
	static Random random = new Random();
	
}