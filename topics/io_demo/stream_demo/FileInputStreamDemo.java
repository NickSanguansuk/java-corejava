package topics.io_demo.stream_demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {

        // Byte streams

        String fileName = "src\\topics\\io_demo\\stream_demo\\dataFile1.txt";

        try {
            FileInputStream fIn = new FileInputStream(fileName);
            //int data = fIn.read();// return the ist byte of the data
            int i;
            while((i = fIn.read()) != -1)
            {
                System.out.print((char)i); //  typecasting
                //byte --> char --> short --. long
            }

            fIn.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
