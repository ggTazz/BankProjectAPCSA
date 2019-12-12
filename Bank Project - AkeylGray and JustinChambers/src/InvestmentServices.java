import java.util.Scanner;
public class InvestmentServices
{
	public static double HedgeFunds(double initialAmount, int years)
	{
	    return initialAmount * years + (initialAmount * 0.2);
	}
}

class StocksBonds 
{
	public void firstQuestions(){
	double shareNumbers = 0;
	double stockPrice = 0;
	Scanner input = new Scanner(System.in);
    double commissionFee = 12.99;
    System.out.println("How much stock did you buy?");
	shareNumbers = input.nextInt();
	System.out.println("What was the price of this stock?");
	stockPrice = input.nextDouble();
	StocksBonds.BuySellStocks(shareNumbers, stockPrice, commissionFee);
	}
	
    public static void BuySellStocks(double shareNumbers, double stockPrice, double commissionFee)
    {
    	double finalstockPrice = shareNumbers * stockPrice + (stockPrice * commissionFee);
    	System.out.println(finalstockPrice);
    }
}
class SellBonds{
	public void secondQuestions(){
		double buyingPrice = 0;
		double sellingPrice = 0;
		double WhenBuy = 0;
		double WhenSell = 0;
		 Scanner input2 = new Scanner(System.in);
		    System.out.println("What was the original price of this stock?");
		    buyingPrice = input2.nextDouble();
		    System.out.println("What are you selling this stock for?");
		    sellingPrice = input2.nextDouble();
		    System.out.println("When did you buy this stock? (WIP)");
		    WhenBuy = input2.nextDouble();
		    System.out.println("When did you sell this stock? (WIP)");
		    WhenSell = input2.nextDouble();
		    SellBonds.CapitalGainsTax(buyingPrice, sellingPrice, WhenBuy, WhenSell);
	}
	
    public static void CapitalGainsTax(double buyingPrice, double sellingPrice, double WhenBuy, double WhenSell)
    {
    if(WhenSell < WhenBuy) {
    	double earlyTax = buyingPrice - sellingPrice * .32;
        System.out.println(earlyTax);
    }
    else if(WhenSell > WhenBuy) {
    	double lateTax = buyingPrice - sellingPrice * .18;
    	System.out.println(lateTax);
    }
    }
}
