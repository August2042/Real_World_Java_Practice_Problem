package financialSectorProblem;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input annual income
		System.out.print("Enter your annual income: $");
		double annualIncome = scanner.nextDouble();

		// Input deductions
		System.out.print("Enter your total deductions: $");
		double deductions = scanner.nextDouble();

		// Calculate taxable income (income - deductions)
		double taxableIncome = annualIncome - deductions;

		// Define tax brackets and rates
		double[] taxBrackets = { 0, 9875, 40125, 85525, 163300, 207350, 518400 };
		double[] taxRates = { 0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37 };

		// Calculate income tax
		double incomeTax = 0;
		double remainingIncome = taxableIncome;

		for (int i = 0; i < taxBrackets.length - 1; i++) {
			double currentBracket = taxBrackets[i + 1] - taxBrackets[i];
			if (remainingIncome <= 0) {
				break;
			} else if (remainingIncome <= currentBracket) {
				incomeTax += remainingIncome * taxRates[i];
				break;
			} else {
				incomeTax += currentBracket * taxRates[i];
				remainingIncome -= currentBracket;
			}
		}

		// Display the calculated income tax
		System.out.printf("Your income tax is: $%.2f%n", incomeTax);

		 
	}
}
