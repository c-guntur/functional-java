package none.cgutils.functional;

import java.util.function.Function;

//NOTE: Java provides some very useful FunctionalInterface types.
public class JavaUnaryOperation {

    //NOTE: Function<parameTer type, Return type> or better: Function<Takes, Returns>
    //TODO: Replace the null with a squared function
    private static Function<Integer, Integer> squared = null;

    //TODO: Replace the null with a cubed function
    private static Function<Integer, Integer> cubed = null;

    public static void main(String[] args) {

        System.out.println("\n----------------------------- Testing calculator");

        //NOTE: Check the java.util.Function for the apply() method.
        // Check the class JavaDoc as well
        System.out.println("Square of 2: " + squared.apply(2));
        System.out.println("Cube of 7: " + cubed.apply(2));
    }
}
