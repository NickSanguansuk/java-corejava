package topics.file_system.read_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFile_Files_ReadAllBytes {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\file_system\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("");
        System.out.println("----------");

        File file = new File(fileName);

        long startTime = System.currentTimeMillis();
        byte[] fileBytes = Files.readAllBytes(file.toPath());
        long stopTime = System.currentTimeMillis();
        char singleChar;
        for (byte b : fileBytes) {
            singleChar = (char) b;
            System.out.print(singleChar);
        }

        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime=" + elapsedTime);

        System.out.println("----------");
    }
}
