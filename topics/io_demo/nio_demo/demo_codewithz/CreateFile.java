package topics.io_demo.nio_demo.demo_codewithz;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void main(String[] args) {

        Path p = Paths.get("src\\topics\\io_demo\\nio_demo\\demo_codewithz\\data_folder\\poem.txt");

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
