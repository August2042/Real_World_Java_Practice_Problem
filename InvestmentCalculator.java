package financialSectorProblem; // Package declaration

import java.util.Scanner;

public class InvestmentCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Display a welcome message
		System.out.println("Welcome to the Investment Calculator!");
		System.out.println("-------------------------------------");

		// Prompt user for initial investment amount
		System.out.println("Enter the initial investment amount: ");
		double initialInvestment = sc.nextDouble();

		// Prompt user for interest rate
		System.out.println("Enter the interest rate: ");
		double interestRate = sc.nextDouble();

		// Prompt user for the time period (in years)
		System.out.println("Enter the time period: ");
		int timePeriod = sc.nextInt();

		// Calculate the future value of the investment using the formula: FV = P * (1 +
		// r)^t
		double futureValueInvestment = initialInvestment * Math.pow(1 + interestRate, timePeriod);

		// Display the future value of the investment
		System.out.printf("The future value of your investment after %d years will be $%.2f%n", timePeriod,
				futureValueInvestment);

	}
}
