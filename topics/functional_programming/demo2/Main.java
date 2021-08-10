package topics.functional_programming.demo2;

public class Main {

    public static void main(String[] args) {

        // example 1
        //IFunction<String, Integer> function1 = new IFunction<String, Integer>() {
        //    @Override
        //    public Integer apply(String str) {
        //        return str.length();
        //    }
        //};
        //
        //System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 1
        //IFunction<String, Integer> function1 = (String str) -> {
        //    return str.length();
        //};
        //System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 1
        IFunction<String, Integer> function1 = (str) -> str.length();
        System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 2
        IFunction<Integer, String> function2 = (number) -> {
            if (number % 2 == 0) {
                return "Number " + number + " is even";
            } else {
                return "Number " + number + " is odd";
            }
        };
        System.out.println(function2.apply(11));

    }
}
