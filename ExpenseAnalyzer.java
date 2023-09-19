package financialSectorProblem;

import java.util.Scanner;

public class ExpenseAnalyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input monthly income
		System.out.print("Enter your monthly income: $");
		double monthlyIncome = scanner.nextDouble();

		// Input total expenses
		System.out.print("Enter your total monthly expenses: $");
		double totalExpenses = scanner.nextDouble();

		// Calculate discretionary income (income - expenses)
		double discretionaryIncome = monthlyIncome - totalExpenses;

		// Analyze expenses and provide suggestions
		System.out.println("\nExpense Analysis:");

		if (discretionaryIncome < 0) {
			// Warn the user when expenses exceed income
			System.out.println("Warning: Your expenses exceed your income. Consider reducing non-essential spending.");
		} else {
			System.out.println("You have discretionary income of $" + discretionaryIncome);

			if (discretionaryIncome > 0) {
				System.out.println("Suggested Actions:");
				if (discretionaryIncome > 100) {
					// Suggest saving or investing more if discretionary income is over $100
					System.out.println("- Consider allocating more to savings or investments.");
				}
				if (discretionaryIncome > 200) {
					// Suggest looking for ways to cut discretionary spending if over $200
					System.out.println("- Look for opportunities to reduce discretionary spending.");
				}
				if (discretionaryIncome > 300) {
					// Suggest reviewing and optimizing subscriptions or memberships if over $300
					System.out.println("- Review and potentially optimize your subscriptions or memberships.");
				}
			}
		}
	}
}
