package topics.file_system.file_demo.demo2;

import java.io.*;

public class IoEx2 {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        BufferedReader bufferStream = null;
        PrintWriter printStream = null;

        File readIn = new File("src\\topics\\file_system\\file_demo\\demo2\\sample2.txt");
        File writeTo = new File("src\\topics\\file_system\\file_demo\\demo2\\sampleTo2.txt");

        try {
            inputStream = new FileReader(readIn);
            outputStream = new FileWriter(writeTo);
            bufferStream = new BufferedReader(inputStream);
            printStream = new PrintWriter(outputStream);
            String lineStr;
            while ((lineStr = bufferStream.readLine()) != null) {
                printStream.println(lineStr);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (bufferStream != null) {
                bufferStream.close();
            }
            if (printStream != null) {
                printStream.close();
            }
        }

    }
}
