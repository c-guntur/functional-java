package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;
import static none.cgutils.functional.AllConstants.X;
import static none.cgutils.functional.AllConstants.Y;

//NOTE: What if we want to
// RE-USE THE CALCULATOR FOR EITHER Integer OR Float IN ADDITION TO Double?
public class Calculator2 {

    public static void main(String[] args) {

        //NOTE: Double Calculator
        //TODO: Replace the null with an 'anonymous' Calculable2 of type Double
        Calculable2<Double> calculatorDouble = null;

        System.out.println("Double calculator");
        System.out.println("\n----------------------------- Testing Calculable2 with Double");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, calculatorDouble.add(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, calculatorDouble.subtract(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, calculatorDouble.multiply(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, calculatorDouble.divide(A, B));

        //NOTE: Integer Calculator
        //TODO: Replace the null with an 'anonymous' Calculable2 of type Double
        Calculable2<Integer> calculatorInteger = null;

        System.out.println("Integer calculator");
        System.out.println("\n----------------------------- Testing Calculable2 with Integer");

        System.out.printf("\nAdd (%d, %d) = %d", X, Y, calculatorInteger.add(X, Y));

        System.out.printf("\nSubtract (%d, %d) = %d", X, Y, calculatorInteger.subtract(X, Y));

        System.out.printf("\nAdd (%d, %d) = %d", X, Y, calculatorInteger.multiply(X, Y));

        System.out.printf("\nAdd (%d, %d) = %d", X, Y, calculatorInteger.divide(X, Y));
    }
}
