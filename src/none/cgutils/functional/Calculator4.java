package none.cgutils.functional;

import static none.cgutils.functional.AllConstants.A;
import static none.cgutils.functional.AllConstants.B;

//NOTE: What if we want to
// NOT BOTHER WITH UNNECESSARY 'BOILERPLATE' CODE?
public class Calculator4 {

    public static void main(String[] args) {

        //NOTE: Magic Calculator
        //TODO: Get rid the boring boilerplate
        Calculable3<Double> add = new Calculable3<Double>() {
            @Override
            public Double compute(Double a, Double b) {
                return a + b;
            }
        };

        //TODO: Get rid the boring boilerplate (Use your IDE to help)
        Calculable3<Double> subtract = new Calculable3<Double>() {
            @Override
            public Double compute(Double a, Double b) {
                return a - b;
            }
        };

        //TODO: Get rid the boring boilerplate
        Calculable3<Double> multiply = new Calculable3<Double>() {
            @Override
            public Double compute(Double a, Double b) {
                return a * b;
            }
        };

        //TODO: Get rid the boring boilerplate
        Calculable3<Double> divide = new Calculable3<Double>() {
            @Override
            public Double compute(Double a, Double b) {
                return a / b;
            }
        };

        System.out.println("Magic calculator");
        System.out.println("\n----------------------------- Testing Calculable3 with Double");

        System.out.printf("\nAdd (%.1f, %.1f) = %.1f", A, B, add.compute(A, B));

        System.out.printf("\nSubtract (%.1f, %.1f) = %.1f", A, B, subtract.compute(A, B));

        System.out.printf("\nMultiply (%.1f, %.1f) = %.1f", A, B, multiply.compute(A, B));

        System.out.printf("\nDivide (%.1f, %.1f) = %.1f", A, B, divide.compute(A, B));
    }
}
