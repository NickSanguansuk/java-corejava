package topics.file_demo.read_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile_FileReader_Read_Encoding {
    public static void main(String[] pArgs) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\file_demo\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("FileReader, FileWriter ---> character streams");
        System.out.println("----------");

        FileInputStream fileInputStream = new FileInputStream(fileName);

        //specify UTF-8 encoding explicitly
        try (InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8")) {
            long startTime = System.currentTimeMillis();
            int singleCharInt;
            char singleChar;
            while ((singleCharInt = inputStreamReader.read()) != -1) {
                //comment out the following lines when running performance tests
                singleChar = (char) singleCharInt;
                System.out.print(singleChar); //display one character at a time
            }
            long stopTime = System.currentTimeMillis();

            long elapsedTime = stopTime - startTime;
            System.out.println("elapsedTime=" + elapsedTime);
        }

        System.out.println("----------");
    }
}

