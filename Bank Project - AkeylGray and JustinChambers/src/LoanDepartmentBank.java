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
		myamountgivenbybankformortgage = mortgage;
		myamountgivenbybankforcollege = college;
		myamountgivenbybankforcar = car;
		myamountgivenbybankforbusiness = business;
		myamountgivenbybankforhome = homeequity;
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
	public int getMortgageAgain()
	{
		return myamountgivenbybankformortgage;
	}
	public int getCollegeAgain()
	{
		return myamountgivenbybankforcollege;
	}
	public int getCarAgain()
	{
		return myamountgivenbybankforcar;
	}
	public int getBusinessAgain()
	{
		return myamountgivenbybankforbusiness;
	}
	public int myamountgivenbybankforhome()
	{
		return myamountgivenbybankforhome;
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
	
	public void getamountgivenbybankformortgage(int mortgage)
	{
		myamountgivenbybankformortgage  = mortgage;
	}
	public void getamountgivenbybankforcollege(int college)
	{
		myamountgivenbybankforcollege = college;
	}
	public void getamountgivenbybankforcar(int car)
	{
		myamountgivenbybankforcar = car;
	}
	public void getamountgivenbybankforbusiness(int business)
	{
		myamountgivenbybankforbusiness = business;
	}
	public void getamountgivenbybankforhome(int homeequity)
	{
		myamountgivenbybankforhome= homeequity;
	}
	//end setters
	
	
	//start functions
	public void giveMoney(int newmortgage, int newcollege, int newcar, int newbusiness, int newhomeequity)
	{
		myMortgage = newmortgage;
		newmortgage = newmortgage + LoanDepartmentBank.myamountgivenbybankformortgage;
	}
	//end of functions

	

//start of instance variables 
private static int myRate;
private static int myTime; //1 year
private static int myMortgage;
private static int myCollegeLoan;
private static int myCarLoan;
private static int myBusinessLoan;
private static int myHomeEquityLoan;
private static int myamountgivenbybankformortgage;
private static int myamountgivenbybankforcollege;
private static int myamountgivenbybankforcar;
private static int myamountgivenbybankforbusiness;
private static int myamountgivenbybankforhome;
// end instance variables
}