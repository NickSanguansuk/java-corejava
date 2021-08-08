package topics.io_demo.file_demo.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadDataFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("----------");
        System.out.println("Read data from file car.csv");

        String fileName = "src\\topics\\io_demo\\file_demo\\demo1\\cars.csv";
        //String fileName = "src/topics/file_demo/demo1/cars.csv";
        //String fileName = "src//topics//file_demo//demo1//cars.csv";

        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            //System.out.println(scanner.nextLine());

            String lineStr = scanner.nextLine();
            String[] dataArray = lineStr.split(",");
            System.out.println(Arrays.toString(dataArray));
        }
    }
}
