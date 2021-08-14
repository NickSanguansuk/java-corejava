package topics.io_demo.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {

    public static void main(String[] args) {

        // Added some texts to the file first

        Path p = Paths.get("src\\topics\\io_demo\\nio_demo\\demo3_codewithz\\data_folder\\poem.txt");

        try {
            List<String> lineData = Files.readAllLines(p);

            for (String s : lineData) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
