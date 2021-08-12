package topics.functional_programming.method_reference.demo2;

import java.util.function.Function;

public class MethodReference1 {

    public static void main(String[] args) {

        // A) Reference to a static method.
        // ContainingClass::staticMethodName

        // Calling parseInt() method using lambda
        Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("12"));

        // Calling parseInt() method using method reference
        Function<String, Integer> referenceFunction = Integer::parseInt;
        System.out.println(referenceFunction.apply("12"));

    }
}
