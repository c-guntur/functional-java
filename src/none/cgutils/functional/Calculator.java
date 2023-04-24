package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: Basic implementation of a calculator with computing methods inline.
public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Basic calculator");
        System.out.println("\n----------------------------- Testing calculator");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, add(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, subtract(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, multiply(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, divide(A, B));
    }

    private static Double add(Double a, Double b) {

        // TODO: Replace the null with a correct math expression
        return null;
    }

    private static Double subtract(Double a, Double b) {

        // TODO: Replace the null with a correct math expression
        return null;
    }

    private static Double multiply(Double a, Double b) {

        // TODO: Replace the null with a correct math expression
        return null;
    }

    private static Double divide(Double a, Double b) {

        // TODO: Replace the null with a correct math expression
        return null;
    }
}
