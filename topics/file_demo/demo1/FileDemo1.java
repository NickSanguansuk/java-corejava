package topics.file_demo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDemo1 {

    public static void main(String[] args) throws FileNotFoundException {

        // The path separator for this system
        String pathSep = System.getProperty("path.separator");
        System.out.println(pathSep);

        // My home directory
        Path homeDir = Paths.get(System.getProperty("user.home"));
        System.out.println(homeDir.toAbsolutePath());

        System.out.println("----------");


        //String fileName = "D:\\intellij-workspace\\corejava\\src\\topics\\file_demo\\demo1\\dataFile1.txt";
        String fileName = "src\\topics\\file_demo\\demo1\\dataFile1.txt";
        //String fileName = "src\\topics\\file_demo\\demo1\\dataFile2.txt";
        File file = new File(fileName);

        System.out.println("----------");

        System.out.println(file.isAbsolute());
        System.out.println(file.getAbsolutePath()); // useful
        System.out.println(file.getParent());

        if (file.exists()) {
            System.out.println("File is found");
            System.out.println("Is the file writable: " + file.canWrite());
            System.out.println("Is the file readable: " + file.canRead());
            System.out.println("File length: " + file.length());

        } else {
            System.out.println("File is not found");
            //throw new FileNotFoundException("throw: File is not found");

            try {
                boolean newFile = file.createNewFile();
                if (newFile) {
                    System.out.println("New file name is: " + file.getName());
                }
            } catch (IOException e) {
                System.out.println("-catch block-");
                System.out.println(e);
            }
        }

        System.out.println("----------");

        Scanner scanner = new Scanner(file);

        //String readLineByLine = scanner.nextLine();
        //System.out.println(readLineByLine); // Only first line
        while (scanner.hasNext()) {
            System.out.println("---");
            String readLineByLine = scanner.nextLine();
            System.out.println(readLineByLine);
        }

    }
}
