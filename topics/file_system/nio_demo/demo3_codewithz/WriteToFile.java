package topics.file_system.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFile {

    public static void main(String[] args) {

        // Need to delete files "dataFile1.txt" and "dataFile2.txt" first

        Path p1 = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder\\dataFile1.txt");
        Path pPoem = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder\\poem.txt");
        Path p2 = Paths.get("src\\topics\\file_system\\nio_demo\\demo3_codewithz\\data_folder\\dataFile2.txt");

        try {

            if (Files.exists(p1)) {
                System.out.println("File already exists");
            } else {
                Path donePath1 = Files.createFile(p1);
                String content = "Hey Coding Owls";
                Files.write(donePath1, content.getBytes());
                System.out.println("Data written as byte array");
            }

            System.out.println("----------");

            if (Files.exists(p2)) {
                System.out.println("File already exists");
            } else {
                List<String> lineData = Files.readAllLines(pPoem);
                Path donePath2 = Files.createFile(p2);
                Files.write(donePath2, lineData);
                System.out.println("Data written in file using List for String");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
