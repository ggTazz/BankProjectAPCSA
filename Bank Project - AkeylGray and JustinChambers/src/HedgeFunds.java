import java.util.Scanner;
public class HedgeFunds {
 
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.print("  <><><>Welcome To The Investment Division!<><><>  \n");
    System.out.print("Input the amount you wish to invest: $");  //Input the amount you wish to invest
 	double investment = in.nextDouble();
	double rate = 0.2;
	System.out.print("Input number of years you wish to invest: ");  //Input the # of years you wish to invest
	int year = in.nextInt();
	
	rate *= 0.2;
	
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
       }
	 }
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}