package none.cgutils.functional;

import java.util.function.BiFunction;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: Java BiFunction can replace the Calculable3 interface
public class UsingBiFunctionAsCalculator {

    //TODO: Replace the null with a BiFunction instance
    private static BiFunction<Double, Double, Double> add = null;

    //TODO: Replace the null with a BiFunction instance
    private static BiFunction<Double, Double, Double> subtract = null;

    //TODO: Replace the null with a BiFunction instance
    private static BiFunction<Double, Double, Double> multiply = null;

    //TODO: Replace the null with a BiFunction instance
    private static BiFunction<Double, Double, Double> divide = null;

    public static void main(String[] args) {

        System.out.println("Magic calculator");
        System.out.println("\n----------------------------- Testing Calculable3 with Double");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, add.apply(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, subtract.apply(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, multiply.apply(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, divide.apply(A, B));
    }
}
