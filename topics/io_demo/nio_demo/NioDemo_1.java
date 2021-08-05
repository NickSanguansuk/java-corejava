package topics.io_demo.nio_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo_1 {

    public static void main(String[] args) {

        String fileName = "src\\topics\\io_demo\\nio_demo\\dataFile_1.txt";

        System.out.println("Read a file to console");
        System.out.println("----------");

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            FileChannel inChannel = inputStream.getChannel();
            long channelSize = inChannel.size();

            // initialize buffer
            ByteBuffer buf = ByteBuffer.allocate((int)channelSize);

            int bytesRead = inChannel.read(buf);
            buf.flip(); // Make buffer ready for read

            for (int i = 0; i < channelSize; i++) {
                System.out.print((char)buf.get());
            }

            inChannel.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
