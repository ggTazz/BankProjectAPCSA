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
        
    if(WhenSell < WhenBuy)
        return buyingPrice - sellingPrice * 0.32;
    else if(WhenSell > WhenBuy)
        return buyingPrice - sellingPrice * 0.18;
    }
}