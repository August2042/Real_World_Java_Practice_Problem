package financialSectorProblem;

import java.util.Scanner;

public class BudgetTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Welcome message
		System.out.println("Welcome to Budget Tracker Calculator!");
		System.out.println("-------------------------------------");

		// Prompt user to enter monthly income
		System.out.println("Enter your monthly income : ");
		double monthlyIncome = sc.nextDouble();

		// Prompt user to enter total monthly expenses
		System.out.println("Enter your total monthly expenses : ");
		double monthlyExpenses = sc.nextDouble();

		// Calculate the remaining balance after expenses
		double remainingBalance = monthlyIncome - monthlyExpenses;

		// Check if the remaining balance is positive (saving money) or negative
		// (overspending)
		if (remainingBalance > 0) {
			System.out.println("Saving Money...");
			System.out.println("Saved money : " + remainingBalance);
		} else {
			System.out.println("Overspending...");
			System.out.println("Overspending money : " + remainingBalance);
		}

	}
}
