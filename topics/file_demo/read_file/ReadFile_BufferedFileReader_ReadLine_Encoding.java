package session5.testing.read_file;

import java.io.*;

public class ReadFile_BufferedFileReader_ReadLine_Encoding {
    public static void main(String[] args) throws IOException {
        System.out.println("javaVersion=" + System.getProperty("java.version"));

        //String fileName = "c:\\temp\\2.sample-10KB.txt";

        String fileName = new File("").getAbsolutePath();
        fileName = fileName + "\\src\\session5\\testing\\read_file\\Wasin.txt";

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
    }
}
