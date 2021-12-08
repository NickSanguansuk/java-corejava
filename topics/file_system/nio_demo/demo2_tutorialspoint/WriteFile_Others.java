package topics.file_system.nio_demo.demo2_tutorialspoint;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile_Others {

    public static void main(String[] args) {

        Path path = Paths.get("src\\topics\\file_system\\nio_demo\\demo2_tutorialspoint\\dataFile3.txt");
        String question = "To be or not to be? What is the answer?";
        Charset charset = StandardCharsets.ISO_8859_1;

        try {
            Files.write(path, question.getBytes());
            List<String> lines = Files.readAllLines(path, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("----------");
        // size(Path path)
        // This method is used to get the size of the file at specified path in bytes.

        try {
            System.out.println(Files.size(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----------");
        // exists(Path path)
        // This method is used to check if file exists at specified path and if the file exists it will return true or else it returns false.

        System.out.println(Files.exists(path));

        System.out.println("----------");

    }
}
