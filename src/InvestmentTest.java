import java.util.Scanner;

public class InvestmentTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Investment stockInvestment1 = new Investment();
        Investment stockInvestment2 = new Investment();
        Investment stockInvestment3 = new Investment();

        //First Investment
        System.out.print("Enter Ticker: ");
        String tickerName = input.nextLine();
        stockInvestment1.setTickerName(tickerName);

        System.out.print("Enter Stock Name: ");
        String stockName = input.nextLine();
        stockInvestment1.setStockName(stockName);

        System.out.print("Enter commission: ");
        double numCommission = input.nextDouble();
        stockInvestment1.setNumCommission(numCommission);

        System.out.print("Enter price per share: ");
        double numShare = input.nextDouble();
        stockInvestment1.setNumShare(numShare);

        System.out.print("Enter Quantity: ");
        double numQuantity = input.nextDouble();
        stockInvestment1.setNumQuantity(numQuantity);

        System.out.print("\n");

        stockInvestment1.printInvestment();

        // Second Investment
        System.out.print("\n\n");

        System.out.print("Enter another Ticker: ");
        input.nextLine();
        String tickerName2 = input.nextLine();
        stockInvestment2.setTickerName(tickerName2);

        System.out.print("Enter Stock Name: ");
        String stockName2 = input.nextLine();
        stockInvestment2.setStockName(stockName2);

        System.out.print("Enter commission: ");
        double numCommission2 = input.nextDouble();
        stockInvestment2.setNumCommission(numCommission2);

        System.out.print("Enter price per share: ");
        double numShare2 = input.nextDouble();
        stockInvestment2.setNumShare(numShare2);

        System.out.print("Enter Quantity: ");
        double numQuantity2 = input.nextDouble();
        stockInvestment2.setNumQuantity(numQuantity2);

        System.out.print("\n");

        stockInvestment2.printInvestment();

        //Third Investment
        System.out.print("\n\n");

        System.out.print("Enter another Ticker: ");
        input.nextLine();
        String tickerName3 = input.nextLine();
        stockInvestment3.setTickerName(tickerName3);

        System.out.print("Enter Stock Name: ");
        String stockName3 = input.nextLine();
        stockInvestment3.setStockName(stockName3);

        System.out.print("Enter commission: ");
        double numCommission3 = input.nextDouble();
        stockInvestment3.setNumCommission(numCommission3);

        System.out.print("Enter price per share: ");
        double numShare3 = input.nextDouble();
        stockInvestment3.setNumShare(numShare3);

        System.out.print("Enter Quantity: ");
        double numQuantity3 = input.nextDouble();
        stockInvestment3.setNumQuantity(numQuantity3);

        System.out.print("\n");

        stockInvestment3.printInvestment();
    }

}
