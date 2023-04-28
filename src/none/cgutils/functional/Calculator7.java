package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: What if we want to
// ENSURE THAT OUR INTERFACE ALWAYS WORKS?
// (Using a FunctionalInterface annotation)
public class Calculator7 {

    public static void main(String[] args) {

        Calculable3<Double> add = (a, b) -> a + b;

        Calculable3<Double> subtract = (a, b) -> a - b;

        Calculable3<Double> multiply = (a, b) -> a * b;

        Calculable3<Double> divide = (a, b) -> a / b;

        System.out.println("\n----------------------------- Ensuring an interface acts as a lambda");

        //NOTE: Using a 'default' method from a FunctionalInterface
        //TODO: Uncomment this line after adding a default method to Calculable3
        //add.printHello();

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, add.compute(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, subtract.compute(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, multiply.compute(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, divide.compute(A, B));
    }
}
