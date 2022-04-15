import java.util.Scanner;
public class SelectingAStock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		int investAmount;
		double stockPrice;
		double peRatio;
		int numberOfShares;
		String stockTicker;
		
		System.out.println("Welcome to the Stock Picker App!");
		
		//get amount willing to invest from user
		System.out.print("Enter the total amount of money you are willing to invest: ");
		investAmount = input.nextInt();
		
		//get stock ticker
		System.out.print("Enter the stock ticker: ");
		stockTicker = keyboard.nextLine();
		if (stockTicker.length() > 5)
		{
			System.out.println("ERROR: Stock ticker cannot be over 5 characters long. Please try again.");
			System.out.println("Enter the stock ticker: ");
			stockTicker = keyboard.nextLine();
		}
		
		//get stock price
		System.out.print("Enter the stock price: ");
		stockPrice = input.nextDouble();
		if (stockPrice < 0.01)
		{
			System.out.println("ERROR: Price can't be negative or zero. Please try again.");
			System.out.println("Enter the stock price: ");
			stockPrice = input.nextDouble();
		}
		
		//get the p/e ratio
		System.out.print("Enter the P/E Ratio: ");
		peRatio = input.nextDouble();
		
		//calculate number of shares
		numberOfShares = (int) (investAmount / stockPrice);
		
		//print out results
		System.out.println("\nBelow are your results:\n");
		System.out.println("Stock: " + stockTicker);
		System.out.println("Price: $" + stockPrice);
		System.out.println("P/E Ratio: " + peRatio);
		if (peRatio > 60)
		{
			System.out.println("WARNING: This company may be overvalued!");
		}
		System.out.println("# of shares able to purchase: " + numberOfShares);
		
	}

}
