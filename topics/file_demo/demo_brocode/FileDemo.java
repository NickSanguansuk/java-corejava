package topics.file_demo.demo_brocode;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        // File = An abstract representation of file and directory path names

        String fileName = "src\\topics\\file_demo\\demo_brocode\\secret_message.txt";

        System.out.println("----------");

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete(); // This is going to delete the file
        } else {
            System.out.println("The file doesn't exist!");
        }



    }
}
