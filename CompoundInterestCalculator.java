package financialSectorProblem;
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = scanner.nextDouble();

        // Input compounding frequency (e.g., monthly, quarterly)
        System.out.print("Enter the compounding frequency (1 for annually, 12 for monthly, 4 for quarterly, etc.): ");
        int compoundingFrequency = scanner.nextInt();

        // Input time period (in years)
        System.out.print("Enter the time period (in years): ");
        int years = scanner.nextInt();

        // Calculate compound interest
        double ratePerPeriod = annualRate / compoundingFrequency;
        int totalPeriods = compoundingFrequency * years;
        double compoundInterest = principal * Math.pow(1 + ratePerPeriod, totalPeriods) - principal;

        // Display the result
        System.out.printf("The compound interest earned is: $%.2f%n", compoundInterest);

         
    }
}
