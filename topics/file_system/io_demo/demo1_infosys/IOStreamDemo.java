package topics.file_system.io_demo.demo1_infosys;

import java.io.*;

public class IOStreamDemo {

    public static void main(String[] args) {

        // Byte Stream

        // FileInputStream
        // FileOutputStream

        String fileName1 = "src/topics/file_system/io_demo/demo1_infosys/OutFile.txt";
        String fileName2 = "src/topics/file_system/io_demo/demo1_infosys/InFile.txt";

        // Character Stream

        // FileReader
        // FileWriter

        String fileName3 = "src/topics/file_system/io_demo/demo1_infosys/ReadFile.txt";
        String fileName4 = "src/topics/file_system/io_demo/demo1_infosys/WriteFile.txt";

        //try(FileOutputStream outFile = new FileOutputStream("OutFile.txt");
        //    FileInputStream inFile = new FileInputStream("InFile.txt");) {
        try(FileOutputStream outFile = new FileOutputStream(fileName1);
            FileInputStream inFile = new FileInputStream(fileName2);
            Reader readFile = new FileReader(fileName3);
            Writer writeFile = new FileWriter(fileName4);
            ) {

            // Byte Stream
            int value = inFile.read();
            while (value != -1) {
                outFile.write(value);
                value = inFile.read();
            }

            // Character Stream
            int value2 = readFile.read();
            while (value2 != -1) {
                writeFile.write(value2);
                value2 = readFile.read();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
