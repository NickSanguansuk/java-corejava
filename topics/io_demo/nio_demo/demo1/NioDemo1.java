package topics.io_demo.nio_demo.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo1 {

    public static void main(String[] args) {

        String fileName = "src\\topics\\io_demo\\nio_demo\\demo1\\dataFile1.txt";

        System.out.println("Read a file to console");
        System.out.println("----------");

        // io   ---> Stream oriented, Blocking IO
        // nio  ---> Buffer oriented, Non-Blocking IO, Selectors

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            FileChannel inChannel = inputStream.getChannel();
            long fileSize = inChannel.size();

            // initialize buffer
            //ByteBuffer buff = ByteBuffer.allocate((int)fileSize);
            // Let's try set the buffer size smaller
            ByteBuffer buff = ByteBuffer.allocate(16);

            int bytesRead = inChannel.read(buff); // Read data into rest of buffer

            while (bytesRead != -1) {
                //System.out.println("Read (bytes): " + bytesRead);
                buff.flip(); // Flip buffer (Make buffer ready)

                while (buff.hasRemaining()) {
                    System.out.print((char)buff.get());
                }

                buff.clear(); // Make buffer ready for writing
                bytesRead = inChannel.read(buff);
            }
            System.out.println();

            inChannel.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
