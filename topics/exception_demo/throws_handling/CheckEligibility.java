package topics.exception_demo.throws_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckEligibility {

    // Check exception: using throws keyword
    public void checkFile() throws FileNotFoundException, IOException {
        System.out.println("-1-");
        FileReader file = new FileReader("F:\\test\\a.txt");
        System.out.println("-2-");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println("-3-");

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        //fileInput.close();
    }

    public void checkFile2() {
        BufferedReader fileInput = null;

        try {
            System.out.println("-1-");
            FileReader file = new FileReader("F:\\test\\a.txt");
            System.out.println("-2-");
            fileInput = new BufferedReader(file);
            System.out.println("-3-");

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());
        } catch(FileNotFoundException e) {
            System.out.println("-catch block-");
            System.out.println(e);
            System.out.println("File not found in a given path");
        } catch (IOException e) {
            System.out.println("-catch block-");
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("-finally block-");
            try {
                fileInput.close();
            } catch (IOException e) {
                System.out.println("-nested catch block-");
                System.out.println(e);
                //e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("-nested catch block-");
                System.out.println(e);
            } finally {
                System.out.println("-nested finally block-");
            }
        }
    }

}
