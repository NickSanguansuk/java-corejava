package topics.file_system.file_demo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {

        String fileName = "src\\topics\\file_system\\file_demo\\demo1\\randomAccessFileData.txt";

        File file = new File(fileName);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        System.out.println("Beginning position: " + randomAccessFile.getFilePointer());
        randomAccessFile.writeUTF("Java package class random access file demo");
        System.out.println("After writing position: " + randomAccessFile.getFilePointer());
        randomAccessFile.seek(0);
        System.out.println("After seek(0) position: " + randomAccessFile.getFilePointer());
        System.out.println(randomAccessFile.readUTF());
        randomAccessFile.close();

    }
}
