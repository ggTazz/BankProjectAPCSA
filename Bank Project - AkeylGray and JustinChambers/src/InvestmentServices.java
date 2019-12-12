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
	String countryDecision;
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
    double commissionFee = 12.99;
    double ForeignPrice = 0;
    System.out.println("How much stock did you buy?");
	shareNumbers = input.nextInt();
	System.out.println("What was the price of this stock?");
	stockPrice = input.nextDouble();
	System.out.println("Where did you buy the stock from?");
	countryDecision = input2.nextLine();
	if (countryDecision.equalsIgnoreCase("Europe")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.EuropeExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Asia")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.AsiaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Australia")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.AustraliaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Russia")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.RussiaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Britain")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.BritishExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("China")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.ChinaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Africa")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.AfricaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("USA")) {
	}
	StocksBonds.BuySellStocks(shareNumbers, stockPrice, commissionFee, ForeignPrice);
	}
	
    public static void BuySellStocks(double shareNumbers, double stockPrice, double commissionFee, double ForeignPrice)
    {
    	double finalstockPrice = shareNumbers * ForeignPrice + (ForeignPrice * commissionFee);
    	if (ForeignPrice == 0) {
    	finalstockPrice = shareNumbers * stockPrice + (stockPrice * commissionFee);
    	}
    	System.out.println(Math.round(finalstockPrice * 100d) / 100d);
    }
}
class SellBonds{
	public void secondQuestions(){
		double buyingPrice = 0;
		double sellingPrice = 0;
		double WhenBuyMonth = 0;
		double WhenBuyYear = 0;
		double WhenSellMonth = 0;
		double WhenSellYear = 0;
		double WhenSell = 0;
		 Scanner input2 = new Scanner(System.in);
		    System.out.println("What was the original price of this stock?");
		    buyingPrice = input2.nextDouble();
		    System.out.println("What are you selling this stock for?");
		    sellingPrice = input2.nextDouble();
		    System.out.println("What year did you buy this stock?");
		    WhenBuyYear = input2.nextDouble();
		    System.out.println("What month did you buy this stock?");
		    WhenBuyMonth = input2.nextDouble();
		    System.out.println("What year did you sell this stock?");
		    WhenSellYear = input2.nextDouble();
		    System.out.println("When month did you sell this stock?");
		    WhenSellMonth = input2.nextDouble();
		    SellBonds.CapitalGainsTax(buyingPrice, sellingPrice, WhenBuyMonth, WhenSellMonth, WhenBuyYear, WhenSellYear);
	}
	
    public static void CapitalGainsTax(double buyingPrice, double sellingPrice, double WhenBuyMonth, double WhenSellMonth, double WhenBuyYear, double WhenSellYear)
    {
    if(WhenSellYear == WhenBuyYear) {
    	double total = WhenSellMonth - WhenBuyMonth;
    	double earlyTax = buyingPrice - sellingPrice * .32;
    	double lateTax = buyingPrice - sellingPrice * .18;
    	if(total > 0 || total < 0) {
    		System.out.println(lateTax);
    	}
    	if(total == 0) {
    		System.out.println(earlyTax);
    	}
}

    if(WhenSellYear > WhenBuyYear) {
    	double earlyTax = buyingPrice - sellingPrice * .32;
    	double lateTax = buyingPrice - sellingPrice * .18;
    	System.out.println(lateTax);
    }
    if(WhenSellYear > WhenBuyYear) {
    	double earlyTax = buyingPrice - sellingPrice * .32;
    	double lateTax = buyingPrice - sellingPrice * .18;
    	System.out.println(earlyTax);
    }
}
}
class ForeignCurrencyExchange
{
    public static double EuropeExchange(double stockPrice)
    {
        return stockPrice * 0.90;
    }
    public static double AsiaExchange(double stockPrice)
    {
        return stockPrice * 71;
    }
    public static double AustraliaExchange(double stockPrice)
    {
        return stockPrice * 1.45;
    }
    public static double BritishExchange(double stockPrice)
    {
        return stockPrice * 0.76;
    }
    public static double AfricaExchange(double stockPrice)
    {
        return stockPrice * 15;
    }
    public static double ChinaExchange(double stockPrice)
    {
        return stockPrice * 7.05;
    }
    public static double RussiaExchange(double stockPrice)
    {
        return stockPrice * 63;
    }
}
