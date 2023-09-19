package financialSectorProblem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the loan amount
		System.out.println("Enter the Loan amount : ");
		double loanAmount = sc.nextDouble();

		// Prompt user to enter the annual interest rate
		System.out.println("Enter the annual interest rate : ");
		double annualInterestRate = sc.nextDouble();

		// Prompt user to enter the duration or time period
		System.out.println("Enter the duration or time period : ");
		int timePeriod = sc.nextInt();

		// Calculate the monthly interest rate
		double monthlyInterestRate = annualInterestRate / 12;

		// Calculate the monthly payment using the loan amortization formula
		double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, timePeriod))
				/ (Math.pow(1 + monthlyInterestRate, timePeriod) - 1);

		DecimalFormat df = new DecimalFormat("0.00");

		// Print the header for the amortization schedule
		System.out.println("Month\tPayment\t\tPrincipal\tInterest\tBalance");
		double balance = loanAmount;

		// Generate and print each month's payment details
		for (int i = 1; i <= timePeriod; i++) {
			double interestPayment = balance * monthlyInterestRate;
			double principalPayment = monthlyPayment - interestPayment;
			balance = balance - principalPayment;

			System.out.println(i + "\t$" + df.format(monthlyPayment) + "\t\t$" + df.format(principalPayment) + "\t\t$"
					+ df.format(interestPayment) + "\t\t$" + df.format(balance));
		}

	}
}
