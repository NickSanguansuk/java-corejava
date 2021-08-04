package session5.testing.read_file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadFile_Files_ReadAllLines_Encoding {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        //String fileName = "c:\\temp\\2.sample-10KB.txt";

        String fileName = new File("").getAbsolutePath();
        fileName = fileName + "\\src\\session5\\testing\\read_file\\Wasin.txt";

        File file = new File(fileName);

        long startTime = System.currentTimeMillis();
        //use UTF-8 encoding
        List<String> fileLinesList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        long stopTime = System.currentTimeMillis();

        for (String line : fileLinesList) {
            System.out.println(line);
        }

        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime=" + elapsedTime);
    }
}
