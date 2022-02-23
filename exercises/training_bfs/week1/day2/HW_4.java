package exercises.training_bfs.week1.day2;

public class HW_4 {

    void printTable(int num) {
        System.out.println("a b pow(a, b)");
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " " + (i + 1) + " " + (int) Math.pow(i, i + 1));
        }
    }

    public static void main(String[] args) {

        HW_4 hw4 = new HW_4();

        int num = 5;
        hw4.printTable(num);
    }
}
