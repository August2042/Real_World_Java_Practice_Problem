package financialSectorProblem;

import java.util.Scanner;

public class CreditCardInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the credit card balance
		System.out.println("Enter the credit card balance : ");
		double balance = sc.nextDouble();

		// Prompt user to enter the monthly payment
		System.out.println("Enter the monthly payment : ");
		double monthlyPayment = sc.nextDouble();

		// Prompt user to enter the number of months
		System.out.println("Enter the number of months : ");
		int months = sc.nextInt();

		double totalInterest = 0;

		// Calculate total interest paid and update the balance for each month
		for (int i = 0; i < months; i++) {
			// Calculate the monthly interest
			double monthlyInterest = balance * 0.01 / 12;

			// Calculate the monthly principal payment
			double monthlyPrincipalPayment = monthlyPayment - monthlyInterest;

			// Update the total interest paid
			totalInterest = totalInterest + monthlyInterest;

			// Update the balance after making the monthly payment
			balance = balance - monthlyPrincipalPayment;
		}

		// Display the total interest paid over the specified number of months
		System.out.printf("Total interest paid over %d months: $%.2f%n", months, totalInterest);
	}
}
