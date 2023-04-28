package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: What if we want to
// SPECIFY DIFFERENT COMPUTATIONS IN DIFFERENT CLASSES?
public class Calculator1 {

    public static void main(String[] args) {

        Calculable1 calculator = null;

        System.out.println("Custom calculator");
        System.out.println("\n----------------------------- Testing calculator");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.add(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, calculator.subtract(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, calculator.multiply(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, calculator.divide(A, B));
    }
}
