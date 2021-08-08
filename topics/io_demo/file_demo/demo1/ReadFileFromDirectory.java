package topics.io_demo.file_demo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileFromDirectory {

    public static void main(String[] args) throws FileNotFoundException {

        //String folderName = "src\\topics\\file_demo\\demo1";
        String folderName = "src\\topics\\io_demo\\file_demo\\demo1";

        File dir = new File(folderName);

        String[] listStrArray = dir.list(); // return an array of String
        System.out.println(Arrays.toString(listStrArray));

        System.out.println("----------");

        File[] listFileArray = dir.listFiles();
        System.out.println(Arrays.toString(listFileArray));

        System.out.println("----------");

        System.out.println("Read data from all files in the folder");
        System.out.println("Now, also put the data to a file");

        String outFileName = "src\\topics\\io_demo\\file_demo\\demo1\\output_files\\outputDataFile.txt";

        FileOutputStream fOut;
        fOut = new FileOutputStream(outFileName, false);

        String str;
        byte[] data;

        for (int i = 0; i < listFileArray.length; i++) {

            try {
                File file = listFileArray[i];
                str = i + " ---> " + file.getName();
                System.out.println(str);

                // Write to file
                data = str.getBytes();
                fOut.write(data);
                fOut.write('\n');

                Scanner scanner = new Scanner(file);

                while (scanner.hasNext()) {
                    str = scanner.nextLine();
                    System.out.println(str);

                    // Write to file
                    data = str.getBytes();
                    fOut.write(data);
                    //fOut.write(10); // same
                    //fOut.write(0x0a); // same
                    fOut.write('\n');
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }

        System.out.println("----------");

    }
}
