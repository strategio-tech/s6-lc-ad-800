package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Calculates the total amount of a loan
     * still needed to be paid off after 10% repayment each month
     * 
     * @param amount is the total loan amount
     * @return the remaining amount of the loan after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // Remaining amount after 10% each year for three months
        final int months = 3;
        for (int i = 0; i < months; i++) {
            int owe = (int) (0.1 * amount);
            amount -= owe;
        }
        return amount ;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
