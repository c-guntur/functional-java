package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

// NOTE: What if we want to
//  RE-USE THE CALCULATOR FOR EITHER Integer OR Float IN ADDITION TO Double?
public class Calculator1 {

    public static void main(String[] args) {

        Calculable1 calculator = null;

        System.out.println("Custom calculator");
        System.out.println("\n----------------------------- Testing calculator");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.add(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.subtract(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.multiply(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.divide(A, B));
    }
}
