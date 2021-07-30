package topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysDemo {
    // Core Java - Arrays
    // Core Java - Array Processing Algorithms

    static void initializeArrayByInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to Array initialization: ");
        int number = scanner.nextInt();
        String[] strArray = new String[number];

        System.out.println("Length of Array is: " + strArray.length);

        //System.out.print("Enter words (separate by space): ");
        //for (int i = 0; i < strArray.length; i++) {
        //    //strArray[i] = scanner.next();
        //
        //    //System.out.println("i: " + i);
        //
        //    if (scanner.hasNext()) {
        //        strArray[i] = scanner.next();
        //        //strArray[i] = scanner.nextLine();
        //    } else {
        //        System.out.println("hasNext() return false");
        //        break;
        //    }
        //}

        System.out.print("Enter words (separate by space, / for exit): ");
        for (int i = 0; i < strArray.length; i++) {
            String tmp = scanner.next();
            if (!(tmp.equals("/"))) {
                strArray[i] = tmp;
            } else {
                break;
            }
        }

        System.out.println(Arrays.toString(strArray));
    }

    static void testScanner01() {
        // This code is not working, if using "System.in"

        Scanner scanner = new Scanner("Hello World!");
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Delimiter: " + scanner.delimiter());

        //System.out.print("Enter words (separate by space): ");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }

    static void testScanner02() {
        // This code is not working as intended

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (separate by space): ");
        List<Integer> list = new ArrayList<>();

        // This loop will break, if the input isn't a number
        // The program is not working as intended
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[list.size()]);

        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        scanner.close();
    }

    static void testScanner03() {
        // This code is working, but it isn't use ".hasNext()"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words (separate by space): ");

        String[] strArr = scanner.nextLine().split(" ");

        for (String s : strArr) {
            System.out.print(s + ", ");
        }
        System.out.println();

        scanner.close();
    }

    public static void main(String[] args) {

        {
            System.out.println("Copying Arrays (Deep copy and Shallow copy)");

            int[] arrayOne = {1, 2, 3, 4, 5, 6};
            int[] arrayTwo = arrayOne;
            int[] arrayThree = arrayOne.clone();

            int[] arrayFour = new int[arrayOne.length];
            System.arraycopy(arrayOne, 0, arrayFour, 0, arrayOne.length);

            // Testing
            int[] arrayTmp1 = new int[arrayOne.length];
            System.out.println(Arrays.toString(arrayTmp1));
            System.arraycopy(arrayOne, 2, arrayTmp1, 1, arrayOne.length - 2 - 1);
            System.out.println(Arrays.toString(arrayTmp1));

            int[] arrayFive = Arrays.copyOf(arrayOne, arrayOne.length);

            // Testing
            int[] arrayTmp2 = Arrays.copyOf(arrayOne, 10);
            System.out.println(Arrays.toString(arrayTmp2));
            int[] arrayTmp3 = Arrays.copyOf(arrayOne, 3);
            System.out.println(Arrays.toString(arrayTmp3));

            System.out.println("----------");

            System.out.println(Arrays.toString(arrayOne));
            System.out.println(Arrays.toString(arrayTwo));
            System.out.println(Arrays.toString(arrayThree));
            System.out.println(Arrays.toString(arrayFour));
            System.out.println(Arrays.toString(arrayFive));

            arrayOne[1] = 100;
            arrayTwo[2] = 200;
            arrayThree[3] = 300;
            arrayFour[4] = 400;
            arrayFive[5] = 500;

            System.out.println(Arrays.toString(arrayOne));
            System.out.println(Arrays.toString(arrayTwo));
            System.out.println(Arrays.toString(arrayThree));
            System.out.println(Arrays.toString(arrayFour));
            System.out.println(Arrays.toString(arrayFive));

            System.out.println("----------");

            System.out.println(arrayOne);
            System.out.println(arrayTwo);
            System.out.println(arrayThree);
            System.out.println(arrayFour);
            System.out.println(arrayFive);

            System.out.println("----------");

            //return getClass().getName() + "@" + Integer.toHexString(hashCode());
            System.out.println(arrayOne.getClass());
            System.out.println(arrayOne.getClass().getName());
            // [ is one dimensional array ([, [[, [[[)
            // I is int, [I is int array

            // Z ---> boolean
            // C ---> char
            // L<classname> ---> class or interface
            // D ---> double
            // F ---> float
            // I ---> int
            // J ---> long
            // S ---> short

            System.out.println(Integer.toHexString(arrayOne.hashCode()));
            System.out.println(arrayOne.getClass().getName() + "@" + Integer.toHexString(arrayOne.hashCode()));

            System.out.println("----------");

            if (arrayOne == arrayOne) {
                System.out.println("Same instance");
            } else {
                System.out.println("Different instance");
            }

            if (arrayOne == arrayTwo) {
                System.out.println("Same instance");
            } else {
                System.out.println("Different instance");
            }

            if (arrayOne == arrayThree) {
                System.out.println("Same instance");
            } else {
                System.out.println("Different instance");
            }

            if (arrayOne == arrayFour) {
                System.out.println("Same instance");
            } else {
                System.out.println("Different instance");
            }

            if (arrayOne == arrayFive) {
                System.out.println("Same instance");
            } else {
                System.out.println("Different instance");
            }

            System.out.println("----------");

            int[] arrayTmp4 = arrayOne.clone();

            System.out.println(Arrays.toString(arrayOne));
            System.out.println(Arrays.toString(arrayTmp4));

            // return Different
            if (arrayOne == arrayTmp4) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }

            // return Different
            if (arrayOne.equals(arrayTmp4)) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }

            // return Same
            if (Arrays.equals(arrayOne, arrayTmp4)) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("2D Arrays");

            int[][] source = {
                    {3, 2},
                    {1, 2, 3, 4},
                    {5, 6},
                    {0, 2, 42, -4, 5}
            };

            int[][] destination = new int[source.length][];
            for (int i = 0; i < source.length; ++i) {
                // Allocating space for each row of destination array
                destination[i] = new int[source[i].length];
                System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
            }

            System.out.println(Arrays.deepToString(source));
            System.out.println(Arrays.deepToString(destination));

            System.out.println("----------");

            source[1][0] = 100;
            destination[2][0] = 200;

            System.out.println(Arrays.deepToString(source));
            System.out.println(Arrays.deepToString(destination));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Using Scanner to initialize an array");
            //initializeArrayByInput();
            System.out.println("----------");
            //testScanner01();
            System.out.println("----------");
            //testScanner02();
            System.out.println("----------");
            testScanner03();
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Arrays.fill()");

            String[] strFill = new String[10];

            //Arrays.fill(strFill, "Conea");
            Arrays.fill(strFill, 1, 5, "Conea");

            System.out.println(Arrays.toString(strFill));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Find elements in the array");

            int[] arr = {10, 34, 10255, 55, 88, 99, 74};

            // Find max value
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Max value: " + max);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Reverse an array");

            int[] oldArray = {1, 2, 3, 4, 5};

            int[] reverseArray = new int[oldArray.length];
            for (int i = 0; i < oldArray.length; i++) {
                reverseArray[i] = oldArray[oldArray.length - 1 - i];
            }

            System.out.println(Arrays.toString(reverseArray));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Sort an int array");

            int[] inArray1 = { 4, 0, 1, 2, 3, 7, 6, 8, 9, 5 };
            Arrays.sort(inArray1);
            System.out.println(Arrays.toString(inArray1));

            System.out.println("----------");

            System.out.println("Sort an int array (manual)");
            int[] inArray2 = { 4, 0, 1, 2, 3, 7, 6, 8, 9, 5 };
            for (int i = 0; i < inArray2.length - 1; i++) {
                int num = inArray2[i];
                for (int j = i + 1; j < inArray2.length; j++) {
                    if (inArray2[j] < inArray2[i]) {
                        int tmp = inArray2[i];
                        inArray2[i] = inArray2[j];
                        inArray2[j] = tmp;
                    }
                }
            }

            System.out.println(Arrays.toString(inArray2));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Delete an element in an array and shift (in-place)");

            int[] arr = {10, 25, 36, 58, 96, 74, 110};

            int removeIndex = 1;

            for (int i = removeIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = 0;

            System.out.println(Arrays.toString(arr));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Binary search (array must be sorted)");

            int[] arr = {10, 25, 36, 58, 96, 74, 110};

            int findMe = 74;

            Arrays.sort(arr);
            int position = Arrays.binarySearch(arr, findMe);
            System.out.println(position);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}
