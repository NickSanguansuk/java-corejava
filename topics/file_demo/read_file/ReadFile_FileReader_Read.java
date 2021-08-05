package topics.file_demo.read_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_FileReader_Read {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\file_demo\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("FileReader, FileWriter ---> character streams");
        System.out.println("----------");

        try (FileReader fileReader = new FileReader(fileName)) {
            long startTime = System.currentTimeMillis();
            int singleCharInt;
            char singleChar;
            while ((singleCharInt = fileReader.read()) != -1) {
                //comment out the following lines when running performance tests
                singleChar = (char) singleCharInt;

                //display one character at a time
                System.out.print(singleChar);
            }
            long stopTime = System.currentTimeMillis();

            long elapsedTime = stopTime - startTime;
            System.out.println("elapsedTime=" + elapsedTime);
        }

        System.out.println("----------");
    }
}

