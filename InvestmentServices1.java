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
    public static double EuropeExchange(double DollarAmount)
    {
        return DollarAmount * 0.90;
    }
    public static double AsiaExchange(double DollarAmount)
    {
        return DollarAmount * 71;
    }
    public static double AustraliaExchange(double DollarAmount)
    {
        return DollarAmount * 1.45;
    }
    public static double BritishExchange(double DollarAmount)
    {
        return DollarAmount * 0.76;
    }
    public static double AfricaExchange(double DollarAmount)
    {
        return DollarAmount * 15;
    }
    public static double ChinaExchange(double DollarAmount)
    {
        return DollarAmount * 7.05;
    }
    public static double RussiaExchange(double DollarAmount)
    {
        return DollarAmount * 63;
    }
}

