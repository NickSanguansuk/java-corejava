package topics.file_system.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

    public static void main(String[] args) {

        // Steps
        // 1. CreateDirectory
        // 2. CreateFile
        // 3. ReadFromFile
        // 4. WriteToFile
        // 5. CopyFile
        // 6. AppendToFile

        Path p = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder");

        try {
            if (Files.exists(p)) {
                System.out.println("Directory already exists");
            } else {
                Path donePath = Files.createDirectories(p);
                System.out.println("Directory is created at " + donePath.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
