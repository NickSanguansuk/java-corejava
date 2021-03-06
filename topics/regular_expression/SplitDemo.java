package topics.regular_expression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SplitDemo {

    public static void main(String[] args) {

        String fileName = "src\\topics\\io_demo\\file_demo\\demo4_split\\sample.txt";
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            System.out.println("----------");

            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                String[] itemInfo = line.split("\\s");
                System.out.println(itemInfo.length);
                System.out.println(Arrays.toString(itemInfo));
            }

            System.out.println("----------");

            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                String[] itemInfo = line.split("\\s ");
                //String[] itemInfo = line.split("\\s{2}");
                //String[] itemInfo = line.split("\\s\\s");
                //String[] itemInfo = line.split("  ");
                System.out.println(itemInfo.length);
                System.out.println(Arrays.toString(itemInfo));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            assert scanner != null;
            scanner.close();
        }

    }
}
