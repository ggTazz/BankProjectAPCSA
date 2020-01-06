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
    public static double commissionFee = 12.99;
    public static double BuySellStocks(int stockPrice, int shareNumbers, double commissionFee)
    {
        return shareNumbers * stockPrice + (stockPrice * commissionFee);
    }
    public static double CapitalGainsTax(double buyingPrice, double sellingPrice, int WhenBuy, int WhenSell)
    {
        
    if(WhenSell = WhenBuy)
        return buyingPrice - sellingPrice * 0.32;
    else if(WhenSell > WhenBuy)
        return buyingPrice - sellingPrice * 0.18;
    }
}

public class ForeignCurrencyExchange
{
    public static double SendAustraliaExchange(double DollarAmount)
    {
        return DollarAmount * 1.45;
    }
    public static double RecieveAustraliaExchange(double AustralianDollar)
    {
        return AustralianDollar * 0.69;
    }
    public static double SendBritishExchange(double DollarAmount)
    {
        return DollarAmount * 0.76;
    }
    public static double RecieveBritishExchange(double pound)
    {
        return pound * 1.33;
    }
    public static double SendChinaExchange(double DollarAmount)
    {
        return DollarAmount * 7.05;
    }
    public static double RecieveChinaExchange(double yuan)
    {
        return yuan * 0.14;
    }
    public static double SendRussiaExchange(double DollarAmount)
    {
        return DollarAmount * 63;
    }
    public static double RecieveRussiaExchange(double ruble)
    {
        return ruble * 0.016;
    }
    public static double SendAlbaniaExchange(double DollarAmount)
    {
        return DollarAmount * 109.55;
    }
    public static double RecieveAlbaniaExchange(double lek)
    {
        return lek * 0.0091;
    }
    public static double SendBrazilExchange(double DollarAmount)
    {
        return DollarAmount * 4.10;
    }
    public static double RecieveBrazilExchange(double real)
    {
        return real * 0.24;
    }
    public static double SendJapanExchange(double DollarAmount)
    {
        return DollarAmount * 109.35;
    }
    public static double RecieveJapanExchange(double yen)
    {
        return yen * 0.0091;
    }
    public static double SendKoreaExchange(double DollarAmount)
    {
        return DollarAmount * 1175.17;
    }
    public static double RecieveKoreaExchange(double won)
    {
        return won * 0.00086;
    }
    public static double SendMexicoExchange(double DollarAmount)
    {
        return DollarAmount * 19.03;
    }
    public static double RecieveMexicoExchange(double peso)
    {
        return peso * 0.053;
    }
    public static double SendNorwayExchange(double DollarAmount)
    {
        return DollarAmount * 9.02;
    }
    public static double RecieveNorwayExchange(double krone)
    {
        return krone * 0.11;
    }
    public static double SendPolandExchange(double DollarAmount)
    {
        return DollarAmount * 3.83;
    }
    public static double RecievePolandExchange(double zloty)
    {
        return zloty * 0.26;
    }
    public static double SendRomaniaExchange(double DollarAmount)
    {
        return DollarAmount * 4.28;
    }
    public static double RecieveRomaniaExchange(double leu)
    {
        return leu * 0.23;
    }
    public static double SendSwitzerlandExchange(double DollarAmount)
    {
        return DollarAmount * 0.98;
    }
    public static double RecieveSwitzerlandExchange(double swiss franc)
    {
        return swiss franc * 1.02;
    }
    public static double SendUAEExchange(double DollarAmount)
    {
        return DollarAmount * 3.67;
    }
    public static double RecieveUAEExchange(double dirham)
    {
        return dirham * 0.27;
    }
    public static double SendTurkeyExchange(double DollarAmount)
    {
        return DollarAmount * 5.85;
    }
    public static double RecieveTurkeyExchange(double lira)
    {
        return lira * 0.17;
    }
    public static double SendVietnamExchange(double DollarAmount)
    {
        return DollarAmount * 23163.65;
    }
    public static double RecieveVietnamExchange(double dong)
    {
        return dong * 0.000043;
    }
    public static double SendSaudiArabiaExchange(double DollarAmount)
    {
        return DollarAmount * 3.75;
    }
    public static double RecieveSaudiArabiaExchange(double riyal)
    {
        return riyal * 0.27;
    }
    public static double SendEuropeExchange(double DollarAmount)
    {
        return DollarAmount * 0.90;
    }
    public static double RecieveEuropeExchange(double euro)
    {
        return euro * 1.11;
    }
    public static double SendAsiaExchange(double DollarAmount)
    {
        return DollarAmount * 71;
    }
    public static double RecieveAsiaExchange(double rupee)
    {
        return rupee * 0.014;
    }
    public static double SendAfricaExchange(double DollarAmount)
    {
        return DollarAmount * 15;
    }
    public static double RecieveAfricaExchange(double rand)
    {
        return rand * 0.069;
    }
}