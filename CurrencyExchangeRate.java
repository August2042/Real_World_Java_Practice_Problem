package financialSectorProblem;

import java.util.Scanner;

public class CurrencyExchangeRate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input the amount to be converted
		System.out.print("Enter the amount to convert: ");
		double amountToConvert = scanner.nextDouble();

		// Input the source currency code
		System.out.print("Enter the source currency code (e.g., USD, INR): ");
		String sourceCurrency = scanner.next().toUpperCase();

		// Input the target currency code
		System.out.print("Enter the target currency code (e.g., USD, INR): ");
		String targetCurrency = scanner.next().toUpperCase();

		// Input the exchange rate from source to target currency
		System.out.print("Enter the exchange rate from " + sourceCurrency + " to " + targetCurrency + ": ");
		double exchangeRate = scanner.nextDouble();

		// Calculate the converted amount
		double convertedAmount = amountToConvert * exchangeRate;

		// Display the converted amount
		System.out.printf("%.2f %s is equivalent to %.2f %s%n", amountToConvert, sourceCurrency, convertedAmount,
				targetCurrency);

	}

}
