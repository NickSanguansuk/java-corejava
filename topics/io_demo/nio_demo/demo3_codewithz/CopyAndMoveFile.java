package topics.io_demo.nio_demo.demo3_codewithz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class CopyAndMoveFile {

    public static void main(String[] args) {

        Path pSource = Paths.get("src\\topics\\io_demo\\nio_demo\\demo3_codewithz\\abc.rar");
        Path pTarget = Paths.get("src\\topics\\io_demo\\nio_demo\\demo3_codewithz\\data_folder\\xyz.rar");

        try {
            if (Files.exists(pTarget)) {
                System.out.println("File already exists");
            } else {
                System.out.println("Started: " + new Date());
                Files.copy(pSource, pTarget); // This will copy
                //Files.move(pSource, pTarget); // This will move and rename
                System.out.println("Completed: " + new Date());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
