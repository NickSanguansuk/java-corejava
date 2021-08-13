package topics.array_demo.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) throws FileNotFoundException {

        // Sample Input

        // 5
        // 1 -2 4 -5 1

        // Sample Output

        // 9

        String fileName = "src\\topics\\array_demo\\hackerrank\\JavaSubarrayFile.txt";
        File file = new File(fileName);

        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(file);

        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //Arrays.stream(arr).forEach(System.out::println);

        int count = 0;

        //for (int i = 0; i < arr.length; i++) {
        //    for (int j = 0; j < arr.length - i; j++) {
        //        int value = 0;
        //        for (int k = 0; k <= i; k++) {
        //            value += arr[j + k];
        //        }
        //        if (value < 0) {
        //            count++;
        //        }
        //    }
        //}

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int k = i; k < arr.length; k++) {
                sum += arr[k];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
