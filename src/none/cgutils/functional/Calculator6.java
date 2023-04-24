package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: What if we want to
// USE AN INTERFACE _ WITHOUT _ IMPLEMENTING IT?
// (Higher Order Functions)
public class Calculator6 {

    public static void main(String[] args) {

        //NOTE: No add lambda!
        Calculable3<Double> subtract = (a, b) -> a - b;

        Calculable3<Double> multiply = (a, b) -> a * b;

        Calculable3<Double> divide = (a, b) -> a / b;

        System.out.println("More magic calculator");
        System.out.println("\n----------------------------- Testing passing code as an argument");

        //NOTE: Passing code around as an argument!
        //TODO: Replace the null with the call to the 'adder' method
        //HINT: (x, y) -> adder(x, y) - or - better yet, use a Method reference!
        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", localAdd(A, B, null));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, subtract.compute(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, multiply.compute(A, B));

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, divide.compute(A, B));
    }

    //NOTE: We do not implement Calculable3 in Example6!
    public static Double adder(Double a, Double b) {

        return a + b;
    }

    private static Double localAdd(Double a, Double b, Calculable3<Double> calculator) {

        return calculator.compute(a, b);
    }
}
