import java.util.Scanner;

public class LoanDepartmentBank {
	  //start of class
	 
	 
	 public void LoanDepartment()  //all will be 0
	 {
	  myRate = 0;
	  myTime = 0;
	  myInterestRate = 0;
	  myCreditScore = 0;
	  myMortgage = 0;
	  myStudentLoan = 0;
	  myCarLoan = 0;
	  myPersonalLoan = 0;
	 }

	 
	 
	 public LoanDepartmentBank(int rate, int time, double intrate, int mortgage, int student, int car, int personal, int creditscore)
	 {
	  
	  myRate  = rate;
	  myTime = time;
	  myInterestRate = intrate;
	  myMortgage = mortgage;
	  myStudentLoan = student;
	  myCarLoan = car;
	  myPersonalLoan = personal;
	  myCreditScore = creditscore;
	 }
	 
	 
	 //start getters
	 public int getrate()
	 {
	  return myRate;
	 }
	 public int gettime()
	 {
	  return myTime;
	 }
	 public double getintrate()
	 {
	  return myInterestRate;
	 }
	 public int getmortgage()
	 {
	  return myMortgage;
	 }
	 public int getstudent()
	 {
	  return myStudentLoan;
	 }
	 public int getcar()
	 {
	  return myCarLoan;
	 }
	 public int getpersonal()
	 {
	  return myPersonalLoan;
	 }
	 public int getcreditscore()
	 {
	  return myCreditScore;
	 }
	 
	// end getters 
	 
	 
	 //start setters 
	 
	 public void setrate(int rate)
	 {
	  myRate = rate;
	 }
	 public void settime(int time)
	 {
	  myTime = time;
	 }
	 public void setintrate(double intrate)
	 {
	  myInterestRate = intrate;
	 }
	 public void setmortgage(int mortgage)
	 {
	  myMortgage = mortgage;
	 }
	 public void setstudent(int student)
	 {
	  myStudentLoan = student;
	 }
	 public void setcar(int car)
	 {
	  myCarLoan = car;
	 }
	 public void setpersonal(int personal)
	 {
	  myPersonalLoan = personal;
	 }
	 public void setcreditscore(int creditscore)
	 {
	  myCreditScore = creditscore;
	 }
	
	
	 //end setters
	 
	 
	 //start functions
	 public static void MortLoan() {
		 System.out.println("How many years do you expect it will take you to pay your home off?\n(1) 15 years\n(2) 30 years");
		 int Ans = Bhivam.nextInt();
		 
		 if (Ans == 1) {
			 myTime = 15;
			 System.out.println("What is your credit score? Enter an answer between 300 and 850");
			 
			 CredScore = Bhivam.nextInt();
			 
			 if (CredScore >= 800 && CredScore < 851) {
				 System.out.println("You have great credit. We will offer you a 4% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
				 myInterestRate = 0.04;
				 myMortgage = Bhivam.nextInt();
				 System.out.println("We can grant you your loan of $" + myMortgage + ". Have a nice day");
				 
			}
		 
			 else if (CredScore >= 650 && CredScore < 800) {
				 System.out.println("You have good credit. We will offer you a 5.5% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
				 myInterestRate = 0.055;
				 myMortgage = Bhivam.nextInt();
				 System.out.println("We can grant you your loan of $" + myMortgage + ". Have a nice day.");
			 }
			 else if (CredScore >= 300 && CredScore < 650) {
				 System.out.println("Sorry your credit score is too low and we wont provide a loan.");}
		 
		 }
		 else if (Ans == 2) {
			 myTime = 30;
			 System.out.println("What is your credit score? Enter an answer between 300 and 850");
			 
			 CredScore = Bhivam.nextInt();
			 
			 if (CredScore >= 800 && CredScore < 851) {
				 System.out.println("You have great credit. We will offer you a 4% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
				 myInterestRate = 0.04;
				 myMortgage = Bhivam.nextInt();
				 System.out.println("We can grant you your loan of $" + myMortgage + ". Have a nice day");
				 
			}
		 
			 else if (CredScore >= 650 && CredScore < 800) {
				 System.out.println("You have good credit. We will offer you a 5.5% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
				 myInterestRate = 0.055;
				 myMortgage = Bhivam.nextInt();
				 System.out.println("We can grant you your loan of $" + myMortgage + ". Have a nice day");
			 }
			 else if (CredScore >= 300 && CredScore < 650) {
				 System.out.println("Sorry your credit score is too low and we wont provide a loan.");
			 }
		 
	} 
		 
			 
			 
			 
	 }
	 
	 public static void CarLoan() {
		 System.out.println("We offer plans to pay back your car over 5 years. How much would you like to loan? Max we offer is 500 thousand.");
		 myTime = 5;
		 myCarLoan = Bhivam.nextInt();
		 System.out.print("What is your credit score? Enter a number between 300 and 850");
		 CredScore = Bhivam.nextInt();
		 if (CredScore >= 800 && CredScore < 851) {
			 System.out.println("You have great credit. We will offer you a 2% interest rate on your loan.");
			 myInterestRate = 0.02;
			 System.out.println("We can grant you your loan of $" + myCarLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 650 && CredScore < 800) {
			 System.out.println("You have good credit. We will offer you a 4.2% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
			 myInterestRate = 0.042;
			 myMortgage = Bhivam.nextInt();
			 System.out.println("We can grant you your loan of $" + myCarLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 300 && CredScore < 650) {
			 System.out.println("Sorry your credit score is too low and we wont provide a loan.");
		 }
 }
	 
	 public static void StudLoan() {
		 System.out.println("We offer plans to pay back your student loan over 15 years. How much would you like to loan? Max we offer is 500 thousand.");
		 myTime = 15;
		 myStudentLoan = Bhivam.nextInt();
		 System.out.print("What is your credit score? Enter a number between 300 and 850");
		 CredScore = Bhivam.nextInt();
		 if (CredScore >= 800 && CredScore < 851) {
			 System.out.println("You have great credit. We will offer you a 5% interest rate on your loan.");
			 myInterestRate = 0.05;
			 System.out.println("We can grant you your loan of $" + myStudentLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 650 && CredScore < 800) {
			 System.out.println("You have good credit. We will offer you a 7% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
			 myInterestRate = 0.07;
			 myMortgage = Bhivam.nextInt();
			 System.out.println("We can grant you your loan of $" + myCarLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 300 && CredScore < 650) {
			 System.out.println("Sorry your credit score is too low and we wont provide a loan.");
		 }
 }
		 
	public static void myPerLoan() {
		System.out.println("We offer personal loans for any purpose of up to 100 thousand. How much would you like?");
		myPersonalLoan = Bhivam.nextInt();
		System.out.println("And for how long do you plan to pay this loan off. Longest we can offer is 1o years?");
		myTime = Bhivam.nextInt();
		System.out.print("What is your credit score? Enter a number between 300 and 850");
		CredScore = Bhivam.nextInt();
		if (CredScore >= 800 && CredScore < 851) {
			 System.out.println("You have great credit. We will offer you a 11% interest rate on your loan.");
			 myInterestRate = 0.11;
			 System.out.println("We can grant you your loan of $" + myPersonalLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 650 && CredScore < 800) {
			 System.out.println("You have good credit. We will offer you a 20% interest rate on your loan.\nNow input how much you would like for your mortgage. Most we can offer is 5 million");
			 myInterestRate = 0.20;
			 myMortgage = Bhivam.nextInt();
			 System.out.println("We can grant you your loan of $" + myPersonalLoan + ". Have a nice day");
		 }
		 
		 else if (CredScore >= 300 && CredScore < 650) {
			 System.out.println("Sorry your credit score is too low and we wont provide a loan.");
		 }
		
	}
		 
	 
	 
	 
	 
	 
	 
	 
	 //end of functions
	
	//start of instance variables 
	public static int myRate;
	public  static int myTime;
	public static double myInterestRate;							
	public static int myMortgage;
	public static int myStudentLoan;
	public static int myCarLoan;
	public static int myPersonalLoan;
	public static int myCreditScore;
	public static int CredScore;
	public static String Shivam;
	public static Scanner Bhivam = new Scanner(System.in);
	// end instance variables
	}
	//end of class;