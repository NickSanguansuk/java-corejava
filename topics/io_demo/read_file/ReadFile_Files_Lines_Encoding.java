package topics.io_demo.read_file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFile_Files_Lines_Encoding {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\io_demo\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("");
        System.out.println("----------");

        File file = new File(fileName);

        long startTime = System.currentTimeMillis();

        try (Stream<String> linesStream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime=" + elapsedTime);

        System.out.println("----------");
    }
}