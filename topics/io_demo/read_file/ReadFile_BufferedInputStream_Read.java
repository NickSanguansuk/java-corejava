package topics.io_demo.read_file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_BufferedInputStream_Read {
    public static void main(String[] pArgs) throws FileNotFoundException, IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\io_demo\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("BufferedInputStream, BufferedOutputStream ---> buffered byte streams");
        System.out.println("----------");

        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        // or
        //FileInputStream fileInputStream = new FileInputStream(fileName);

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            long startTime = System.currentTimeMillis();

            int singleCharInt;
            char singleChar;
            while ((singleCharInt = bufferedInputStream.read()) != -1) {
                //comment out the following lines when running performance tests
                singleChar = (char) singleCharInt;
                System.out.print(singleChar);
            }
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("elapsedTime=" + elapsedTime);
        }

        System.out.println("----------");
    }
}
