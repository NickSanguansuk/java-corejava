package topics.file_demo.demo_brocode;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        // Character streams

        // FileWriter =
        //

        String fileName = "src\\topics\\file_demo\\demo_brocode\\poem.txt";

        System.out.println("----------");

        try {
            FileWriter fWriter = new FileWriter(fileName);
            fWriter.write("Roses are red.\nViolets are blue\nBla bla bla bla\nRockin' everywhere!");
            fWriter.write("\nThis is Conea.");
            fWriter.append("\nThis is Wasin."); // Recommended
            fWriter.append("\nBat").append("\tCat").append("\tRat");
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
