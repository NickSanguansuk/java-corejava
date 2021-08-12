package topics.functional_programming.method_reference.demo2;

import java.util.function.Function;

public class MethodReference3 {

    public static void main(String[] args) {

        // C) Reference to an instance method of an arbitrary object of a particular type
        // ContainingType::methodName

        // Calling toLowerCase() method using lambda
        Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction.apply("JAVA"));

        // Calling toLowerCase() method using method reference
        Function<String, String> referenceFunction = String::toLowerCase;
        System.out.println(referenceFunction.apply("JAVA"));

    }
}
