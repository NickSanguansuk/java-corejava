package topics.file_system.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void main(String[] args) {

        Path p = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder\\poem.txt");

        try {
            if (Files.exists(p)) {
                System.out.println("File already exists");
            } else {
                Path donePath = Files.createFile(p);
                System.out.println("File is created at :" + donePath.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
