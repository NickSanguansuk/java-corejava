package topics.io_demo.file_demo.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StreamEx1 {

    public static void main(String[] args) throws IOException {

        Scanner sc = null;
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src\\topics\\io_demo\\file_demo\\demo2\\sample1.txt");
            sc = new Scanner(inputStream, StandardCharsets.UTF_8);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            // Note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }

    }
}
