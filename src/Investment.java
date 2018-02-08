
public class Investment {

    private String tickerName;
    private String stockName;
    private double numCommission;
    private double numShare;
    private double numQuantity;

    public void setTickerName(String name)
    {
        tickerName = name;
    }

    public String getName()
    {
        return tickerName;
    }

    public void setStockName(String name)
    {
        stockName = name;
    }

    public String getStockName()
    {
        return stockName;
    }

    public void setNumCommission(double userNum)
    {
        numCommission = userNum;
    }

    public double getNumCommission()
    {
        return numCommission;
    }

    public void setNumShare(double userNum)
    {
        numShare = userNum;
    }

    public double getNumShare()
    {
        return numShare;
    }

    public void setNumQuantity(double userNum)
    {
        numQuantity = userNum;
    }

    public double getNumQuantity()
    {
        return numQuantity;
    }

    public void printInvestment()
    {
        System.out.printf("Ticker: %s, Stock Name: %s and total investment: $%.2f", tickerName, stockName, numShare * numQuantity + numCommission);
    }
}