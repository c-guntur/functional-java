package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: What if we want to
// PASS CODE AROUND INSTEAD OF JUST VALUES?
public class Calculator5 {

    public static void main(String[] args) {

        //NOTE: More magic Calculator
        Calculable3<Double> add = (a, b) -> a + b;

        Calculable3<Double> subtract = (a, b) -> a - b;

        Calculable3<Double> multiply = (a, b) -> a * b;

        Calculable3<Double> divide = (a, b) -> a / b;

        System.out.println("More magic calculator");
        System.out.println("\n----------------------------- Testing passing code as an argument");

        //NOTE: Passing code around as an argument!
        //TODO: Replace the null with the 'add' lambda
        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, localAdd(A, B, null));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, subtract.compute(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, multiply.compute(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, divide.compute(A, B));
    }

    private static Double localAdd(Double a, Double b, Calculable3<Double> calculator) {

        return calculator.compute(a, b);
    }
}
