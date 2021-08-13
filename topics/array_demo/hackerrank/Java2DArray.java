package topics.array_demo.hackerrank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {

    public static void main(String[] args) throws IOException {

        // Sample Input

        // 1 1 1 0 0 0
        // 0 1 0 0 0 0
        // 1 1 1 0 0 0
        // 0 0 2 4 4 0
        // 0 0 0 2 0 0
        // 0 0 1 2 4 0

        // Sample Output

        // 19

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "src\\topics\\array_demo\\hackerrank\\Java2DArrayFile.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Added code here

        int maxI = arr.size();
        int maxJ = arr.get(0).size();

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < maxI - 2; i++) {
            for (int j = 0; j < maxJ - 2; j++) {
                int sum = arr.get(i).get(j) +
                        arr.get(i).get(j + 1) +
                        arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) +
                        arr.get(i + 2).get(j + 1) +
                        arr.get(i + 2).get(j + 2);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
