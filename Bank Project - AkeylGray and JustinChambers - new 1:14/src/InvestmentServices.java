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
	String companyDecision;
	String countryDecision;
	String currencyTitle;
	double lV = 0;
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
    double commissionFee = 12.99;
    double ForeignPrice = 0;
    System.out.println("How many shares did you buy?");
	shareNumbers = input.nextInt();
	while(lV == 0) {
	System.out.println("What company did you buy this stock from?");
	System.out.println("Press 'Help' for available options");
	companyDecision = input2.nextLine();
	if (companyDecision.equalsIgnoreCase("Apple")) {
		stockPrice = 279.50;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("CVS")) {
		stockPrice = 74.20;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("Microsoft")) {
		stockPrice = 154.89;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("Disney")) {
		stockPrice = 148.08;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("McDonald's")) {
		stockPrice = 198.16;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("NVIDIA")) {
		stockPrice = 227.00;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("Visa")) {
		stockPrice = 185.51;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("AT&T")) {
		stockPrice = 38.64;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("Verizon")) {
		stockPrice = 61.45;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("FedEx")) {
		stockPrice = 164.25;
		lV = 1;
	}
	if (companyDecision.equalsIgnoreCase("Help")) {
		System.out.println("CVS");
		System.out.println("Apple");
		System.out.println("Microsoft");
		System.out.println("Disney");
		System.out.println("McDonald's");
		System.out.println("NVIDIA");
		System.out.println("Visa");
		System.out.println("AT&T");
		System.out.println("Verizon");
		System.out.println("FedEx");
	}
	}
	while (lV == 1) {
	System.out.println("Where did you buy this stock from?");
	System.out.println("Press 'Help' for more options.");
	companyDecision = input.nextLine();
	countryDecision = input2.nextLine();
	if (countryDecision.equalsIgnoreCase("Europe")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendEuropeExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Asia")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendAsiaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Australia")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendAustraliaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Russia")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendRussiaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Britain")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendBritishExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("China")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendChinaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Africa")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendAfricaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Albania")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendAlbaniaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Mexico")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendMexicoExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Korea")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendKoreaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Norway")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendNorwayExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Romania")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendRomaniaExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Poland")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendPolandExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Japan")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendJapanExchange(stockPrice);
		lV = 2;
		}
	}
	if (countryDecision.equalsIgnoreCase("Saudi Arabia")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendSaudiArabiaExchange(stockPrice);
		lV = 2;
		}		
	}
	if (countryDecision.equalsIgnoreCase("United Arab Emirates")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendUAEExchange(stockPrice);
		lV = 2;
		}		
	}
	if (countryDecision.equalsIgnoreCase("Vietnam")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendVietnamExchange(stockPrice);
		lV = 2;
		}		
	}
	if (countryDecision.equalsIgnoreCase("Switzerland")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendSwitzerlandExchange(stockPrice);
		lV = 2;
		}		
	}
	if (countryDecision.equalsIgnoreCase("Brazil")) {
		InvestmentCountries FEC = new InvestmentCountries();{
		ForeignPrice = InvestmentCountries.SendBrazilExchange(stockPrice);
		lV = 2;
		}		
	}
	if (countryDecision.equalsIgnoreCase("USA")) {
		lV = 2;
	}
	if (countryDecision.equalsIgnoreCase("Help")) {
		System.out.println("Australia");
		System.out.println("Britain");
		System.out.println("China");
		System.out.println("Russia");
		System.out.println("Albania");
		System.out.println("Brazil");
		System.out.println("Japan");
		System.out.println("Korea");
		System.out.println("Mexico");
		System.out.println("Norway");
		System.out.println("Poland");
		System.out.println("Romania");
		System.out.println("Switzerland");
		System.out.println("United Arab Emirates");
		System.out.println("Turkey");
		System.out.println("Vietnam");
		System.out.println("Saudi Arabia");
		System.out.println("Europe");
		System.out.println("Asia");
		System.out.println("Africa");
		System.out.println("USA - Default");
	}
	StocksBonds.BuySellStocks(shareNumbers, stockPrice, commissionFee, ForeignPrice);
	}
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
		int lV = 0;
		String companyDecision;
		double stockPrice = 0;
		String countryDecision;
		double ForeignPrice = 0;
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		while (lV == 0) {
		System.out.println("What company did you buy this stock from?");
		System.out.println("Press 'Help' for available options");
		companyDecision = input2.nextLine();
		if (companyDecision.equalsIgnoreCase("Apple")) {
			stockPrice = 279.50;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("CVS")) {
			stockPrice = 74.20;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("Microsoft")) {
			stockPrice = 154.89;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("Disney")) {
			stockPrice = 148.08;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("McDonald's")) {
			stockPrice = 198.16;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("NVIDIA")) {
			stockPrice = 227.00;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("Visa")) {
			stockPrice = 185.51;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("AT&T")) {
			stockPrice = 38.64;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("Verizon")) {
			stockPrice = 61.45;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("FedEx")) {
			stockPrice = 164.25;
			lV = 1;
		}
		if (companyDecision.equalsIgnoreCase("Help")) {
			System.out.println("CVS");
			System.out.println("Apple");
			System.out.println("Microsoft");
			System.out.println("Disney");
			System.out.println("McDonald's");
			System.out.println("NVIDIA");
			System.out.println("Visa");
			System.out.println("AT&T");
			System.out.println("Verizon");
			System.out.println("FedEx");
		}
		}
			System.out.println("How much are you selling this stock for?");
			sellingPrice = input2.nextDouble();
		    System.out.println("What year did you buy this stock?");
		    WhenBuyYear = input2.nextDouble();
		    System.out.println("What month did you buy this stock?");
		    WhenBuyMonth = input2.nextDouble();
		    System.out.println("What year did you sell this stock?");
		    WhenSellYear = input2.nextDouble();
		    System.out.println("When month did you sell this stock?");
		    WhenSellMonth = input2.nextDouble();
		    while (lV == 1) {
		    System.out.println("Where did you buy the stock from?");
			countryDecision = input3.nextLine();
				if (countryDecision.equalsIgnoreCase("Europe")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveEuropeExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Asia")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveAsiaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Australia")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveAustraliaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Russia")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveRussiaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Britain")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveBritishExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("China")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveChinaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Africa")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveAfricaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Albania")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveAlbaniaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Mexico")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveMexicoExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Korea")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveKoreaExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Norway")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveNorwayExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Romania")) {
					ForeignPrice = InvestmentCountries.RecieveRomaniaExchange(sellingPrice);
					lV = 2;
				}
				if (countryDecision.equalsIgnoreCase("Poland")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecievePolandExchange(sellingPrice);
					lV = 2;
					}
				}
				if (countryDecision.equalsIgnoreCase("Japan")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveJapanExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("Saudi Arabia")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveSaudiArabiaExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("United Arab Emirates")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveUAEExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("Vietnam")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveVietnamExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("Switzerland")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.RecieveSwitzerlandExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("Brazil")) {
					InvestmentCountries FEC = new InvestmentCountries();{
					ForeignPrice = InvestmentCountries.SendBrazilExchange(sellingPrice);
					lV = 2;
					}		
				}
				if (countryDecision.equalsIgnoreCase("USA")) {
					lV = 2;
				}
				if (countryDecision.equalsIgnoreCase("Help")) {
					System.out.println("Australia");
					System.out.println("Britain");
					System.out.println("China");
					System.out.println("Russia");
					System.out.println("Albania");
					System.out.println("Brazil");
					System.out.println("Japan");
					System.out.println("Korea");
					System.out.println("Mexico");
					System.out.println("Norway");
					System.out.println("Poland");
					System.out.println("Romania");
					System.out.println("Switzerland");
					System.out.println("United Arab Emirates");
					System.out.println("Turkey");
					System.out.println("Vietnam");
					System.out.println("Saudi Arabia");
					System.out.println("Europe");
					System.out.println("Asia");
					System.out.println("Africa");
					System.out.println("USA - Default");
				}
		    }
		    SellBonds.CapitalGainsTax(stockPrice, sellingPrice, WhenBuyMonth, WhenSellMonth, WhenBuyYear, WhenSellYear);
	}
    public static void CapitalGainsTax(double stockPrice, double sellingPrice, double WhenBuyMonth, double WhenSellMonth, double WhenBuyYear, double WhenSellYear)
    {
    if(WhenSellYear == WhenBuyYear) {
    	double total = WhenSellMonth - WhenBuyMonth;
    	double earlyTax = stockPrice - sellingPrice * .32;
    	double lateTax = stockPrice - sellingPrice * .18;
    	if(total > 0 || total < 0) {
    		System.out.println(lateTax);
    	}
    	if(total == 0) {
    		System.out.println(earlyTax);
    	}
}

    if(WhenSellYear > WhenBuyYear) {
    	double earlyTax = stockPrice - sellingPrice * .32;
    	double lateTax = stockPrice - sellingPrice * .18;
    	System.out.println(lateTax);
    }
    if(WhenSellYear < WhenBuyYear) {
    	double earlyTax = stockPrice - sellingPrice * .32;
    	double lateTax = stockPrice - sellingPrice * .18;
    	System.out.println(earlyTax);
    }
}
}

