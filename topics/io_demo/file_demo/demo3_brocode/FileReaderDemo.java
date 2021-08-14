package topics.io_demo.file_demo.demo3_brocode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        // Character streams

        // FileReader = Read the contents of a file as a stream of characters, One by one.
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read

        // search ---> ASCII Art Archive

        String fileName = "src\\topics\\io_demo\\file_demo\\demo3_brocode\\art.txt";

        System.out.println("----------");

        try {
            FileReader fReader = new FileReader(fileName);
            int data = fReader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = fReader.read();
            }
            fReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
