package exercises.training_bfs.week1.day2;

public class HW_3 {

    void printSquaresAndCubes(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.printf("%-8d %-8d %-8d\n", i, i * i, i * i * i);
        }
    }

    public static void main(String[] args) {

        HW_3 hw3 = new HW_3();

        int num = 10;
        hw3.printSquaresAndCubes(num);
    }
}
