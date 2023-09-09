package financialSectorProblem;

import java.util.Scanner;

public class StockPortfolio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Stock Portfolio Calculator!");
		System.out.println("------------------------------------------");

		System.out.println("Enter the number of stocks in your portfolio: ");
		int numberOfStocks = sc.nextInt();

		// Arrays to store information about each stock
		String stockName[] = new String[numberOfStocks];
		int stockQuantity[] = new int[numberOfStocks];
		double stockPurchasePrice[] = new double[numberOfStocks];
		double stockCurrentPrice[] = new double[numberOfStocks];

		// Loop to input information for each stock
		for (int i = 0; i < numberOfStocks; i++) {
			System.out.println("Enter the stock name : ");
			stockName[i] = sc.nextLine(); // Read the stock name
			sc.nextLine(); // Consume the newline character

			System.out.println("Enter the quantity of stocks : ");
			stockQuantity[i] = sc.nextInt(); // Read the quantity of stocks

			System.out.println("Enter the stock purchase price : ");
			stockPurchasePrice[i] = sc.nextDouble(); // Read the purchase price

			System.out.println("Enter the stock current price : ");
			stockCurrentPrice[i] = sc.nextDouble(); // Read the current price
		}

		double portfolioTotalValue = 0;

		// Calculate the total value of the portfolio
		for (int i = 0; i < numberOfStocks; i++) {
			portfolioTotalValue += stockQuantity[i] * stockCurrentPrice[i];
		}

		// Display the total portfolio value
		System.out.printf("The total value of your stock portfolio is $%.2f%n", portfolioTotalValue);

		// Thank you message
		System.out.println("Thank you for using the Stock Portfolio Calculator!");
	}
}
