package financialSectorProblem;

import java.util.Scanner;

public class LoanApproval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int creditScore;
		double income;
		double loanAmount;

		System.out.println("Welcome to the Loan Approval System");
		System.out.println("------------------------------------");
		System.out.println("Enter the credit score :");
		creditScore = sc.nextInt();

		System.out.println("Enter the income :");
		income = sc.nextDouble();

		System.out.println("Enter the loan amount :");
		loanAmount = sc.nextDouble();

		// Defined criteria for approval of Loan

		int definedCreditScore = 650;
		double definedIncome = 35000.0;
		double definedLoanAmount = 800000.0;
		if (creditScore >= definedCreditScore && income >= definedIncome && loanAmount <= definedLoanAmount) {
			System.out.println("Congratulations! Your loan is approved.");
		} else if (creditScore < definedCreditScore) {
			System.out.println("Sorry, your loan application is denied due to a low credit score.");
		} else if (definedIncome > income) {
			System.out.println("Sorry, your loan application is denied due to insufficient income.");
		} else if (loanAmount > definedLoanAmount) {
			System.out.println(
					"Sorry, your loan application is denied due to requesting a loan amount exceeding the maximum limit.");
		} else {
			System.out.println("Sorry, your loan application is denied for an unspecified reason.");
		}

	}
				 
}
