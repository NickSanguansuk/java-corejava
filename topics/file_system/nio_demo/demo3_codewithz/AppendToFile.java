package topics.file_system.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendToFile {

    public static void main(String[] args) {

        Path p1 = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder\\dataFile1.txt");

        try {
            String content = "Are you ready for learning a new thing?";

            String newLine = "\n";
            Files.write(p1, newLine.getBytes(), StandardOpenOption.APPEND);
            // or
            //Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);

            Files.write(p1, content.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Data appended as byte array");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
