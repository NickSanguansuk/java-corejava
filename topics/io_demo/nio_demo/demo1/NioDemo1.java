package topics.io_demo.nio_demo.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo1 {

    public static void main(String[] args) {

        String fileName = "src\\topics\\io_demo\\nio_demo\\dataFile1.txt";

        System.out.println("Read a file to console");
        System.out.println("----------");

        // io   ---> Stream oriented, Blocking IO
        // nio  ---> Buffer oriented, Non-Blocking IO, Selectors

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            FileChannel inChannel = inputStream.getChannel();
            long channelSize = inChannel.size();

            // initialize buffer
            ByteBuffer buff = ByteBuffer.allocate((int)channelSize);

            int bytesRead = inChannel.read(buff); // Read data into rest of buffer
            buff.flip(); // Flip buffer (Make buffer ready)

            for (int i = 0; i < channelSize; i++) {
                System.out.print((char)buff.get());
            }

            inChannel.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
