import java.util.Scanner;
public class HedgeFunds
{
	public static double HedgeFunds(double initialAmount, int years)
	{
	    return initialAmount * years + (initialAmount * 0.2);
	}
}

public class StocksBonds 
{
    double commissionFee = 12.99
    public static double BuySellStocks(int shareNumbers, double stockPrice, double commissionFee)
    {
        return shareNumbers * stockPrice + (stockPrice * commissionFee);
    }
    public static double CapitalGainsTax(double buyingPrice, double sellingPrice, double WhenBuy, double WhenSell)
    {
        
    if(WhenSell = WhenBuy)
        return buyingPrice - sellingPrice * 0.32;
    else if(WhenSell > WhenBuy)
        return buyingPrice - sellingPrice * 0.18;
    }
}

public class ForeignCurrencyExchange
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