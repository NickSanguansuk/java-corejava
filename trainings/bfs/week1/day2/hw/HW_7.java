package trainings.bfs.week1.day2.hw;

public class HW_7 {

    void printNumberInWord(int number) {
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }

    public static void main(String[] args) {

        HW_7 hw7 = new HW_7();

        int num1 = 7;
        hw7.printNumberInWord(num1);

        int num2 = 0;
        hw7.printNumberInWord(num2);

        int num3 = 20;
        hw7.printNumberInWord(num3);
    }
}
