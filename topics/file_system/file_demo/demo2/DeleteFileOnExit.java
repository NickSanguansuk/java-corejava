package topics.file_system.file_demo.demo2;

import java.io.File;
import java.io.IOException;

public class DeleteFileOnExit {

    public static void main(String[] args) throws InterruptedException {

        File temp;

        try {
            temp = File.createTempFile("src\\topics\\file_system\\file_demo\\demo2\\myTempFile",".txt");
            System.out.println("Temp file created: " + temp.getAbsolutePath());

            // temp.delete(); // For deleting immediately

            temp.deleteOnExit(); // Delete on runtime exit

            System.out.println("Temp file exists: " + temp.exists());

            //Thread.sleep(2000);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Thread.sleep(2000);
    }
}
