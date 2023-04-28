package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: Basic implementation of a calculator with computing methods inline.
public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Basic calculator");
        System.out.println("\n----------------------------- Testing calculator");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculator.add(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, calculator.subtract(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, calculator.multiply(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, calculator.divide(A, B));
    }

    private Double add(Double a, Double b) {

        //TODO: Replace the null with a correct math expression
        return null;
    }

    private Double subtract(Double a, Double b) {

        //TODO: Replace the null with a correct math expression
        return null;
    }

    private Double multiply(Double a, Double b) {

        //TODO: Replace the null with a correct math expression
        return null;
    }

    private Double divide(Double a, Double b) {

        //TODO: Replace the null with a correct math expression
        return null;
    }
}
