package topics.file_system.file_demo.demo2;

import java.io.*;

public class IoEx1 {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        File readIn = new File("src\\topics\\file_system\\file_demo\\demo2\\sample1.txt");
        File writeTo = new File("src\\topics\\file_system\\file_demo\\demo2\\sampleTo1.txt");

        try {
            inputStream = new FileReader(readIn);
            outputStream = new FileWriter(writeTo);
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}
