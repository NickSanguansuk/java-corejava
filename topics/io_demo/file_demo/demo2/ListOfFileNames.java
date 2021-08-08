package topics.io_demo.file_demo.demo2;

import java.io.File;
import java.util.Locale;

public class ListOfFileNames {

    public static void main(String[] args) {

        File file = new File("src\\topics\\io_demo\\file_demo\\demo2");
        String[] fileList = file.list();

        for (String name : fileList) {
            System.out.println(name);
        }

        System.out.println("----------");

        for (String f : fileList) {
            if (f.toLowerCase().endsWith(".txt")) {
                System.out.println(f);
            }
        }

    }
}
