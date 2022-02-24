package trainings.bfs.week1.day3.hw.hw4;

public class IntegerArrayMath {

    void divideArray(int[] numbers, int[] denoms) {

        for (int i = 0; i < numbers.length; i++) {

            try {
                int result = numbers[i] / denoms[i];
                if (numbers[i] % denoms[i] != 0) {
                    throw new NonIntResultException(numbers[i], denoms[i]);
                }
                System.out.println(numbers[i] + "/" + denoms[i] + " is " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is undefined");
            } catch (NonIntResultException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        IntegerArrayMath obj = new IntegerArrayMath();

        int[] numbers = {4, 8, 15};
        int[] denoms = {2, 0, 4};

        obj.divideArray(numbers, denoms);
    }
}
