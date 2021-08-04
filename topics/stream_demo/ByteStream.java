package topics.stream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) {

        // Byte Stream

        String fileName = "src\\topics\\stream_demo\\dataFile1.txt";

        try {
            FileInputStream fIn = new FileInputStream(fileName);
            //int data = fIn.read();// return the ist byte of the data
            int i;
            while( (i = fIn.read() ) != -1)
            {
                System.out.println((char) i); //  typecasting
                //byte --> char --> short --. long
            }

            fIn.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}