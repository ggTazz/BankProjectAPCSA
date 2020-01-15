class customer {
	
	public customer() {
		
		myName = "";
		myAddress = "";
		myDOB = 0;
		myphoneNumber = 0;
		myatmPin = 0;
		myUsername = "";
		myPassword = "";
		myBalance = 0;
		mysBalance = 0;
		
	}

	public customer(String name, String address, double DOB, double phoneNumber, int atmPin, String username, String password, double balance, double sbalance) {
		
		myName = name;
		myAddress = address;
		myDOB = DOB;
		myphoneNumber = phoneNumber;
		myatmPin = atmPin;
		myUsername = username;
		myPassword = password;
		myBalance = balance;
		mysBalance = sbalance;
		
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
	public double getBalance() {
		return myBalance;
	}
	public void setBalance(double balance) {
		myBalance = balance;
	}
	public double getsBalance() {
		return mysBalance;
	}
	public void setsBalance(double sbalance) {
		mysBalance = sbalance;
	}
	public void addBalance(double amount) {
		myBalance = myBalance + amount;
	}
	public void addsBalance(double amount) {
		mysBalance = mysBalance + amount;
	}
	public void minusBalance(double amount) {
		myBalance = myBalance - amount;
	}
	public void minussBalance(double amount) {
		mysBalance = mysBalance - amount;
	}
	public void overdraftProt() {
		if(myBalance < 0 || mysBalance < 0) {
			myBalance = myBalance - 35;
			System.out.println("$35 Overdraft Fee charged.");
		}
	}
	
	
	//getter setter close
	
	private String myName, myAddress, myUsername, myPassword;
	private static int myatmPin;
	private double myDOB, myphoneNumber, myBalance, mysBalance;
	
}