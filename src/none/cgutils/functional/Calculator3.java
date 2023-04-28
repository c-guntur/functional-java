package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;
import static none.cgutils.functional.AllConstants.X;
import static none.cgutils.functional.AllConstants.Y;

//NOTE: What if we want to
// NOT BOTHER CREATING A LIMITED CALCULATOR BUT ALLOW FOR MORE OPERATIONS?
// • What if we wanted to add a modulus or power operation?
public class Calculator3 {

    public static void main(String[] args) {

        //NOTE: Single Operation Calculator
        //TODO: Replace the null with an 'add' Calculable3 of type Double
        Calculable3<Double> add = null;

        //TODO: Replace the null with an 'subtract' Calculable3 of type Double
        Calculable3<Double> subtract = null;

        //TODO: Replace the null with an 'multiply' Calculable3 of type Double
        Calculable3<Double> multiply = null;

        //TODO: Replace the null with an 'divide' Calculable3 of type Double
        Calculable3<Double> divide = null;

        System.out.println("Single operation calculator");
        System.out.println("\n----------------------------- Testing Calculable3 with Double");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, add.compute(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, subtract.compute(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, multiply.compute(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, divide.compute(A, B));
    }
}
