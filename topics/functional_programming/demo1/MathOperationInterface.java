package topics.functional_programming.demo1;

@FunctionalInterface
public interface MathOperationInterface {

    int manipulateTwoNumber(int a, int b);

    public default double manipulateTwoNumber(double a, double b) {
        return 2 * (a + b);
    }
}
