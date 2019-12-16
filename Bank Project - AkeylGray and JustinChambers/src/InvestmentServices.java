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
	String currencyTitle;
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
		currencyTitle = "Euros";
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
	if (countryDecision.equalsIgnoreCase("Albania")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.AlbaniaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Mexico")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.MexicoExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Korea")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.KoreaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Norway")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.NorwayExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Romania")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.RomaniaExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Poland")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.PolandExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("Japan")) {
		ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
		ForeignPrice = ForeignCurrencyExchange.JapanExchange(stockPrice);
		}
	}
	if (countryDecision.equalsIgnoreCase("USA")) {
	}
	StocksBonds.BuySellStocks(shareNumbers, stockPrice, commissionFee, ForeignPrice);
	}
	
    public static void BuySellStocks(double shareNumbers, double stockPrice, double commissionFee, double ForeignPrice)
    {
    	StocksBonds SB = new StocksBonds();{
    	double finalstockPrice = shareNumbers * ForeignPrice + (ForeignPrice * commissionFee);
    	if (ForeignPrice == 0) {
    	finalstockPrice = shareNumbers * stockPrice + (stockPrice * commissionFee);
    	}
    	System.out.println("Your Price is " + Math.round(finalstockPrice * 100d) / 100d);
    	}
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
		String countryDecision;
		double ForeignPrice = 0;
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
		    System.out.println("Where did you buy the stock from?");
			countryDecision = input2.nextLine();
				if (countryDecision.equalsIgnoreCase("Europe")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.EuropeExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Asia")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.AsiaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Australia")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.AustraliaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Russia")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.RussiaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Britain")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.BritishExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("China")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.ChinaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Africa")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.AfricaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Albania")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.AlbaniaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Mexico")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.MexicoExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Korea")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.KoreaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Norway")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.NorwayExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Romania")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.RomaniaExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Poland")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.PolandExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("Japan")) {
					ForeignCurrencyExchange FEC = new ForeignCurrencyExchange();{
					ForeignPrice = ForeignCurrencyExchange.JapanExchange(sellingPrice);
					}
				}
				if (countryDecision.equalsIgnoreCase("USA")) {
				}
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
	public static double AustraliaExchange(double DollarAmount)
    {
        return DollarAmount * 1.45;
    }
    public static double BritishExchange(double DollarAmount)
    {
        return DollarAmount * 0.76;
    }
    public static double ChinaExchange(double DollarAmount)
    {
        return DollarAmount * 7.05;
    }
    public static double RussiaExchange(double DollarAmount)
    {
        return DollarAmount * 63;
    }
    public static double AlbaniaExchange(double DollarAmount)
    {
        return DollarAmount * 109.55;
    }
    public static double BrazilExchange(double DollarAmount)
    {
        return DollarAmount * 4.10;
    }
    public static double JapanExchange(double DollarAmount)
    {
        return DollarAmount * 109.35;
    }
    public static double KoreaExchange(double DollarAmount)
    {
        return DollarAmount * 1175.17;
    }
    public static double MexicoExchange(double DollarAmount)
    {
        return DollarAmount * 19.03;
    }
    public static double NorwayExchange(double DollarAmount)
    {
        return DollarAmount * 9.02;
    }
    public static double PolandExchange(double DollarAmount)
    {
        return DollarAmount * 3.83;
    }
    public static double RomaniaExchange(double DollarAmount)
    {
        return DollarAmount * 4.28;
    }
    public static double EuropeExchange(double DollarAmount)
    {
        return DollarAmount * 0.90;
    }
    public static double AsiaExchange(double DollarAmount)
    {
        return DollarAmount * 71;
    }
    public static double AfricaExchange(double DollarAmount)
    {
        return DollarAmount * 15;
    }
}
