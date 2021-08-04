package session5.testing.read_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFile_Files_Lines {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        //String fileName = "c:\\temp\\2.sample-10KB.txt";

        String fileName = new File("").getAbsolutePath();
        fileName = fileName + "\\src\\session5\\testing\\read_file\\Wasin.txt";

        File file = new File(fileName);

        long startTime = System.currentTimeMillis();

        try (Stream<String> linesStream = Files.lines(file.toPath())) {
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime=" + elapsedTime);
    }
}
