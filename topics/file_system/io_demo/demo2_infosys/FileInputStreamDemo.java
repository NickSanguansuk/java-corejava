package topics.file_system.io_demo.demo2_infosys;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        String fileName1 = "src/topics/file_system/io_demo/demo2_infosys/DemoFile.txt";

        long startTime = System.currentTimeMillis();

        FileInputStream inFile = new FileInputStream(fileName1);

        int value = inFile.read();
        while (value != -1) {
            value = inFile.read();
        }

        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime));
        inFile.close();

        // Time taken: 3903
    }
}
