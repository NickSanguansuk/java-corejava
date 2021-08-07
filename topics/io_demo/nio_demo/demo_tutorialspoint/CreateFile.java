package topics.io_demo.nio_demo.demo_tutorialspoint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void main(String[] args) {

        // createFile(Path filePath, FileAttribute attrs)
        // Files class provides this method to create file using specified Path.

        // Initialize Path object
        Path path = Paths.get("src\\topics\\io_demo\\nio_demo\\demo_tutorialspoint\\dataFile1.txt");

        // Create file
        try {
            // Have to delete the created file "dataFile1.txt" first
            Path createdFilePath = Files.createFile(path);
            System.out.println("Created a file at: " + createdFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
