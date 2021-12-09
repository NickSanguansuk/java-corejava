package topics.file_system.io_demo.demo1and2together;

import java.io.*;

public class IOStreamDemoFull {

    public static void main(String[] args) {

        String fileName1 = "src/topics/file_system/io_demo/demo1and2together/OutFile.txt";
        String fileName2 = "src/topics/file_system/io_demo/demo1and2together/InFile.txt";

        String fileName3 = "src/topics/file_system/io_demo/demo1and2together/ReadFile.txt";
        String fileName4 = "src/topics/file_system/io_demo/demo1and2together/WriteFile.txt";

        try(BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(fileName1));
            BufferedInputStream inFile = new BufferedInputStream(new FileInputStream(fileName2));
            Reader readFile = new FileReader(fileName3);
            Writer writeFile = new FileWriter(fileName4);){

            //Byte Stream
            int value = inFile.read();
            while (value != -1) {
                outFile.write(value);
                value = inFile.read();
            }

            //Character Stream
            int value2 = readFile.read();
            while (value2 != -1) {
                writeFile.write(value2);
                value2 = readFile.read();
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}




