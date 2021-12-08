package topics.file_system.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_BufferedFileReader_ReadLine {
    public static void main(String[] args) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\file_system\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("BufferedReader, BufferedWriter ---> buffered character streams");
        // It's generally a good idea to wrap a FileReader in a BufferedReader for improved performance.
        System.out.println("----------");

        FileReader fileReader = new FileReader(fileName);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            long startTime = System.currentTimeMillis();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //comment out next line for performance tests
                System.out.println(line);
            }
            long stopTime = System.currentTimeMillis();

            long elapsedTime = stopTime - startTime;
            System.out.println("elapsedTime=" + elapsedTime);
        }

        System.out.println("----------");
    }
}
