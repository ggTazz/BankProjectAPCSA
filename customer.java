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