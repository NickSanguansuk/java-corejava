package topics.basic_demo.test;

// - 2 4 6 8
// - 1 3 5 7 9
// - 1 3 5 7
// - 1 2 3 4 5 6 7 8 9

public class Jump_statements {

    public static void main(String[] args) {

        int x = 2;
        int y = 0;
        for (; y < 10; ++y) {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else

                System.out.print(y + " ");
        }
    }
}
