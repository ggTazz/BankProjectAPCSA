package bankloandepartment;
//Kunal Khemchandani
//Period 3


public class LoanDepartmentBank {
		//start of class

	
	
	public LoanDepartmentBank()  //all will be 0
	{
		myRate = 0;
		myTime = 0;
		myMortgage = 0;
		myCollegeLoan = 0;
		myCarLoan = 0;
		myBusinessLoan = 0;
		myHomeEquityLoan = 0;
	}
	
	
	
	public LoanDepartmentBank(int rate, int time, int mortgage, int college, int car, int business, int homeequity)
	{
		
		myRate  = rate;
		myTime = time;
		myMortgage = mortgage;
		myCollegeLoan = college;
		myCarLoan = car;
		myBusinessLoan = business;
		myHomeEquityLoan = homeequity;
		

	}
	
	
	
	//start getters
	public int getRate()
	{
		return myRate;
	}
	
	public int getTime()
	{
		return myTime;
	}
	
	public int getMortgage()
	{
		return myMortgage;
	}
	
	public int getCollege()
	{
		return myCollegeLoan;
	}
	
	public int getCar()
	{
		return myCarLoan;
	}
	
	public int getBusiness()
	{
		return myBusinessLoan;
	}
	
	public int getHome()
	{
		return myHomeEquityLoan;
	}

	// end getters 
	
	
	//start setters 
	
	public void setRate(int rate)
	{
		myRate = rate;
	}
	
	public void setTime(int time)
	{
		myTime = time;
	}
	public void setMortgage(int mortgage)
	{
		myMortgage = mortgage;
	}
	public void setCollege(int college)
	{
		myCollegeLoan = college;
	}
	public void setCar(int car)
	{
		myCarLoan = car;
	}
	public void setBusiness(int business)
	{
		myBusinessLoan = business;
	}
	public void setHome(int homeequity)
	{
		myHomeEquityLoan = homeequity;
	}

	// end setters
	
	
	//start functions
	
	
	public void giveMoney(int mortgage, int college, int car, int business, int homeequity)
	{
		
	}







//start of instance variables 
private static int myRate;
private static int myTime; //1 year
private static int myMortgage;
private static int myCollegeLoan;
private static int myCarLoan;
private static int myBusinessLoan;
private static int myHomeEquityLoan;

// end instance variables
}

//end of class;
