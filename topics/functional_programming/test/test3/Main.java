package topics.functional_programming.test.test3;

public class Main {

    public static void main(String[] args) {
        NumberComparator c = (a, b) -> {
            if (a > b) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(c.compareNumbers(15, 10));
    }
}
