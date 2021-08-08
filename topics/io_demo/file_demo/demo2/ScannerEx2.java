package topics.io_demo.file_demo.demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = null;
        File readIn = new File("src\\topics\\io_demo\\file_demo\\demo2\\sample1.txt");

        FileReader inputStream = null;
        BufferedReader bufferStream = null;

        Double sum = 0.0;

        try {
            inputStream = new FileReader(readIn);
            bufferStream = new BufferedReader(inputStream);
            scanner = new Scanner(bufferStream);

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                } else {
                    System.out.println(scanner.next());
                }
            }

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println("Total sum is: " + sum);
    }
}
