package topics.io_demo.nio_demo.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo2 {

    public static void main(String[] args) {

        String[] inFileNames = {"src\\topics\\io_demo\\nio_demo\\demo1\\dataFile2a.txt",
                "src\\topics\\io_demo\\nio_demo\\demo1\\dataFile2b.txt"};

        String outFileName = "src\\topics\\io_demo\\nio_demo\\demo1\\dataFile2c.txt";

        System.out.println("Read 2 files (2a, 2b) to a file (2c)");
        System.out.println("----------");

        try {
            // Get channel for output
            FileOutputStream outStream = new FileOutputStream(outFileName);
            FileChannel outChannel = outStream.getChannel();

            for (int i = 0; i < inFileNames.length; i++) {
                // Get channel for input
                FileInputStream inStream = new FileInputStream(inFileNames[i]);
                FileChannel inChannel = inStream.getChannel();

                // Transfer data from input channel to output channel
                inChannel.transferTo(0, inChannel.size(), outChannel);

                // Close the input channel
                inChannel.close();
                inStream.close();
            }

            // Finally, close the target channel
            outChannel.close();
            outStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
