package topics.stream_demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriterStream {

    public static void main(String[] args) {

        // Byte Writer Stream

        String fileName = "src\\topics\\stream_demo\\dataOutputFile.txt";

        FileOutputStream fOut = null;

        try {
            fOut = new FileOutputStream(fileName, true); // true is append to the old file
            String str = "Welcome to Java. ";
            byte[] data = str.getBytes();
            fOut.write(data);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fOut.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e);
            }
        }

        System.out.println("End of main()");
    }
}
