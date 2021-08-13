package topics.array_demo.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) throws FileNotFoundException {

        // Sample Input

        // 5
        // 5 41 77 74 22 44
        // 1 12
        // 4 37 34 36 52
        // 0
        // 3 20 22 33
        // 5
        // 1 3
        // 3 4
        // 3 1
        // 4 3
        // 5 5

        // Sample Output

        // 74
        // 52
        // 37
        // ERROR!
        // ERROR!

        String fileName = "src\\topics\\array_demo\\hackerrank\\JavaArraylistFile.txt";
        File file = new File(fileName);

        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(file);

        List<List<Integer>> mainList = new ArrayList<>();
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            mainList.add(list);
        }

        //mainList.stream().forEach(System.out::println);
        // [41, 77, 74, 22, 44]
        // [12]
        // [37, 34, 36, 52]
        // []
        // [20, 22, 33]

        //int p = scanner.nextInt();
        //for (int i = 0; i < p; i++) {
        //    int r = scanner.nextInt();
        //    int s = scanner.nextInt();
        //    if (r > mainList.size() || s > mainList.get(r-1).size()) {
        //        System.out.println("ERROR!");
        //        continue;
        //    }
        //    System.out.println(mainList.get(r-1).get(s-1));
        //}

        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            int r = scanner.nextInt();
            int s = scanner.nextInt();
            try {
                System.out.println(mainList.get(r-1).get(s-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}
