package topics.file_demo.read_file;

import java.io.*;

public class ReadFile_BufferedFileReader_ReadLine_Encoding {
    public static void main(String[] args) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        String fileName = "src\\topics\\file_demo\\read_file\\Wasin.txt";

        System.out.println("----------");
        System.out.println("BufferedReader, BufferedWriter ---> buffered character streams");
        System.out.println("----------");

        FileInputStream fileInputStream = new FileInputStream(fileName);

        //specify UTF-8 encoding explicitly
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
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
