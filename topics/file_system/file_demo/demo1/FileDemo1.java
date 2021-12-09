package topics.file_system.file_demo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDemo1 {

    public static void main(String[] args) /*throws FileNotFoundException*/ {

        // The path separator for this system
        String pathSep = System.getProperty("path.separator");
        System.out.println(pathSep);

        // My home directory
        Path homeDir = Paths.get(System.getProperty("user.home"));
        System.out.println(homeDir.toAbsolutePath());

        System.out.println("----------");

        // 1
        String currentPath1 = null;
        try {
            //currentPath1 = new File(".").getCanonicalPath();
            currentPath1 = new File("").getCanonicalPath();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Current path 1:" + currentPath1);

        // 2 (I like this one)
        String currentPath2 = new File("").getAbsolutePath();
        System.out.println("Current path 2:" + currentPath2);

        // 3
        String currentPath3 = System.getProperty("user.dir");
        System.out.println("Current path using System:" + currentPath3);

        System.out.println("----------");
        System.out.println("Relative path");

        //String fileName = "D:\\intellij-workspace\\corejava\\src\\topics\\file_demo\\demo1\\dataFile1.txt";
        String fileName = "src\\topics\\file_system\\file_demo\\demo1\\dataFile1.txt";
        //String fileName = "src\\topics\\file_demo\\demo1\\dataFile2.txt";

        String directoryName = "src\\topics\\file_system\\file_demo\\demo1\\output_files";
        String directoryName2 = "src\\topics\\file_system\\file_demo\\demo1\\dummy_directory";

        System.out.println(fileName);
        System.out.println(directoryName);

        System.out.println("----------");

        File file = new File(fileName);

        System.out.println(file.isAbsolute());
        System.out.println(file.getAbsolutePath()); // useful
        System.out.println(file.getParent());

        if (file.exists()) {
            System.out.println("File is found");

            System.out.println("Name of the file: " + file.getName());
            System.out.println("Path of the file: " + file.getParent());
            System.out.println("Is the file writable: " + file.canWrite());
            System.out.println("Is the file readable: " + file.canRead());
            System.out.println("File length: " + file.length());

            System.out.println("isFile: " + file.isFile());
            System.out.println("isDirectory: " + file.isDirectory());
            System.out.println("list: " + file.list());

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

        File dir = new File(directoryName);
        System.out.println("isDirectory: " + dir.isDirectory());
        String[] fileNames = dir.list();
        for (String name : fileNames) {
            System.out.println(name);
        }

        System.out.println("----------");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //String readLineByLine = scanner.nextLine();
        //System.out.println(readLineByLine); // Only first line
        while (scanner.hasNext()) {
            System.out.println("---");
            String readLineByLine = scanner.nextLine();
            System.out.println(readLineByLine);
        }

    }
}
