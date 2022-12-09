package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
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
