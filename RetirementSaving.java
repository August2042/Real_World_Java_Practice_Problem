package financialSectorProblem;

import java.util.Scanner;

public class RetirementSaving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the retirement saving goal
		System.out.println("Enter the retirement saving goal : ");
		double retirementSavingGoal = sc.nextDouble();

		// Prompt user to enter their current savings
		System.out.println("Enter your current saving : ");
		double currentSaving = sc.nextDouble();

		// Prompt user to enter the annual interest rate
		System.out.println("Enter the annual interest rate : ");
		double interestRate = sc.nextDouble();

		// Prompt user to enter their retirement age
		System.out.println("Enter your retirement age : ");
		int retirementAge = sc.nextInt();

		// Prompt user to enter their current age
		System.out.println("Enter your current age : ");
		int currentAge = sc.nextInt();

		// Calculate the number of years until retirement
		int yearsUntilRetirement = retirementAge - currentAge;

		// Calculate the monthly interest rate
		double monthlyInterestRate = interestRate / 12;

		// Calculate the monthly savings needed to reach the retirement goal
		double monthlySavings = (retirementSavingGoal - currentSaving)
				/ ((1 - Math.pow(1 + monthlyInterestRate, -yearsUntilRetirement)) / monthlyInterestRate);

		// Display the calculated monthly savings needed
		System.out.printf("You need to save $%.2f each month to reach your retirement goal.%n", monthlySavings);

		 
	}
}
