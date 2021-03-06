package topics.array_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayDemo {
    // Core Java - Arrays
    // Core Java - Array Processing Algorithms

    static int findIndex(int[] arr, int num) {
        int index = Arrays.binarySearch(arr, num);
        return  (index < 0) ? -1 : index;
    }

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

    static int myBinarySearch(int[] arr, int searchValue) {
        return myBinarySearch(arr, 0, arr.length - 1, searchValue);
    }

    static int myBinarySearch(int[] arr, int i0, int i1, int searchValue) {
        if (i0 > i1) {
            return -1;
        }

        int iMid = (i0 + i1) / 2;

        if (arr[iMid] == searchValue) {
            return iMid;
        }

        if (arr[iMid] > searchValue) {
            return myBinarySearch(arr, i0, iMid - 1, searchValue);
        } else {
            return myBinarySearch(arr, iMid + 1, i1, searchValue);
        }
    }

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Playing with the main method signature
            // The args parameter is an array of String
            System.out.println("main(String[] args)");
            System.out.println("args.length: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // An array is a data structure that represents an indexed collection of values, all of the same data type.

            // The array is a data structure, which stores a fixed-size sequential collection of elements of the same type.
            // An array is used to store a collection of data or
            // An array is a collection of similar type of elements which has contiguous memory location.

            // The direct superclass of an array type is Object.
            // Since arrays are Objects in Java, we can find their length method

		    // All arrays are reference types, no matter their element type.
			// arrays is allocated on the heap memory

            System.out.println("Array");

            // Declaring array
            int[] b = new int[10]; // Declaration, instantiation and initialization (not initialization), this is recommended
            int a[] = new int[10]; // (Not recommended)

            byte[] byteArray = new byte[10];
            short[] shortArray = new short[10];
            long[] longArray = new long[10];
            float[] floatArray = new float[10];
            char[] charArray = new char[10];
            String[] strArray = new String[10];
            Object[] objArray = new Object[10];

            // When an array is created, its elements are assigned a default value depending on the element data type:

            // 0, 0L, 0.0f, 0.0d        ---> numeric primitive data types
            // 'u000' (Unicode)          ---> char
            // false                    ---> boolean
            // null                     ---> reference types (including String or any object)

            // Initializing
            b[0] = 100;
            System.out.println("Value at 0 index --> " + b[0]);
            b[1] = 123;
            System.out.println("Value at 1 index --> " + b[1]);

            b[2] = b[0] + b[1];
            System.out.println("Value at 2 index --> " + b[2]);

            b[b.length - 1] = 999;  // last index
            System.out.println("Value at the last index --> " + b[b.length - 1]);

            System.out.println(Arrays.toString(b));

            System.out.println("----------");

            // Declare and initialize Array in one step
            int[] c = {10, 2, 3, 4 + 5, 5 + 6, 2, 4, 5, 4, 5, 4, 100};
            System.out.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3] + "," + c[4] + ",...");

            System.out.println(Arrays.toString(c));

            System.out.println("The length of Array c is :" + c.length);

            System.out.println("----------");
            System.out.println("Ways to Iterating over an Array");

            // Iterating over an Array using for loop
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + ", ");
                //System.out.println("Element at index " + i + ": " + c[i]);
                //			System.out.println(c[2]);
                //			System.out.println(c[3]);
                //			System.out.println(c[4]);
                //			System.out.println(c[5]);
            }
            System.out.println();

            // Iterating over an Array using enhance for loop
            //Arrays.sort(c);
            for (int i : c) {
                //System.out.println("Element at index " + findIndex(c, i) + ": " + i);
                System.out.print(i + ", ");
            }
            System.out.println();

            // Iterating over an Array using Stream
            Arrays.stream(c).forEach(x -> System.out.print(x + ", "));
            System.out.println();

            // Print an Array using Arrays.toString()
            // Arrays class: additional class in java, which support to Array in java
            //System.out.println("Arrays class");
            System.out.println(Arrays.toString(c));

            System.out.println("----------");

            String[] st = {"Perscholas", "non profit Organization", "programming courses", "TekSystem"};
            System.out.println(Arrays.toString(st));

            // Assign values to elements in array using loop
            System.out.println("Assign values to all elements in Array");
            int[] values = new int[5];
            for (int i = 0; i < values.length; i++) {
                values[i] = i * 100;
                // 0, 100, 200, 300
                //System.out.println(values[i]);
                System.out.print(values[i] + ", ");
            }
            System.out.println();

            // Assign values to elements in array using Stream .toArray()
            AtomicInteger i = new AtomicInteger(0);
            values = Arrays.stream(values)
                    .map(x -> i.getAndIncrement() * 10)
                    .toArray();
            //for (int v : values) {
            //    System.out.print(v + ", ");
            //}
            //System.out.println();
            System.out.println(Arrays.toString(values));

            // There is another toArray() for converting list to Array
            // Check that function in line 86

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Copying Arrays (Deep copy and Shallow copy)");

            int[] arrayOne = {1, 2, 3, 4, 5, 6};
            System.out.println("arrayOne: " + Arrays.toString(arrayOne));
            int[] arrayTwo = arrayOne;
            System.out.println("arrayTwo: " + Arrays.toString(arrayTwo));
            int[] arrayThree = arrayOne.clone();
            System.out.println("arrayThree: " + Arrays.toString(arrayThree));

            System.out.println("----------");
            System.out.println("System.arraycopy()");

            int[] arrayFour = new int[arrayOne.length];
            System.arraycopy(arrayOne, 0, arrayFour, 0, arrayOne.length);
            System.out.println("arrayFour: " + Arrays.toString(arrayFour));

            // Testing
            int[] arrayTmp1 = new int[arrayOne.length];
            System.out.println(Arrays.toString(arrayTmp1));
            System.arraycopy(arrayOne, 2, arrayTmp1, 1, arrayOne.length - 3);
            System.out.println(Arrays.toString(arrayTmp1));

            System.out.println("----------");
            System.out.println("Arrays.copyOf()");

            int[] arrayFive = Arrays.copyOf(arrayOne, arrayOne.length);
            System.out.println("arrayFive: " + Arrays.toString(arrayFive));

            // Testing
            int[] arrayTmp2 = Arrays.copyOf(arrayOne, 10);
            System.out.println(Arrays.toString(arrayTmp2));
            int[] arrayTmp3 = Arrays.copyOf(arrayOne, 3);
            System.out.println(Arrays.toString(arrayTmp3));

            // Testing
            int[] arrayTmp4 = Arrays.copyOfRange(arrayOne, 3, 10); // Copy index 3 to 9
            // There are only values in index 3, 4, 5
            // [4, 5, 6, 0, 0, 0, 0]
            System.out.println(Arrays.toString(arrayTmp4));

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

            System.out.println(Arrays.toString(arrayOne)); // same obj
            System.out.println(Arrays.toString(arrayTwo)); // same obj
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
            System.out.println("x == y   and   x.equals(y)   and   Arrays.equals(x, y)");

            int[] arrayTmp5 = arrayOne.clone();

            System.out.println(Arrays.toString(arrayOne));
            System.out.println(Arrays.toString(arrayTmp5));

            // return Different
            if (arrayOne == arrayTmp5) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }

            // return Different
            if (arrayOne.equals(arrayTmp5)) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }

            // return Same
            if (Arrays.equals(arrayOne, arrayTmp5)) {
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

            // Copy 2D arrays using .arraycopy()
            int[][] destination = new int[source.length][];
            for (int i = 0; i < source.length; ++i) {
                // Allocating space for each row of destination array
                destination[i] = new int[source[i].length];
                System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
            }

            // Copy 2D arrays using nested loop
            int[][] destination2 = new int[source.length][];
            for (int i = 0; i < source.length; ++i) {
                // Allocating space for each row of destination array
                destination2[i] = new int[source[i].length];
                for (int j = 0; j < source[i].length; ++j) {
                    destination2[i][j] = source[i][j];
                }
            }

            System.out.println(Arrays.deepToString(source));
            System.out.println(Arrays.deepToString(destination));
            System.out.println(Arrays.deepToString(destination2));

            System.out.println("----------");

            source[1][0] = 100;
            destination[2][0] = 200;

            System.out.println(Arrays.deepToString(source));
            System.out.println(Arrays.deepToString(destination));

            System.out.println("----------");

            for (int i = 0; i < source.length; i++) {
                for (int j = 0; j < source[i].length; j++) {

                    System.out.print(source[i][j] + ", ");
                }
                System.out.println();
            }
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
            //testScanner03();
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Arrays.fill()");

            String[] strFill = new String[10];

            //Arrays.fill(strFill, "Conea");
            // Fill indexes 1 - 4
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
            int[] oldArray = {1, 2, 3, 4, 5};

            System.out.println("Reverse an array");

            int[] reverseArray = new int[oldArray.length];
            for (int i = 0; i < oldArray.length; i++) {
                reverseArray[i] = oldArray[oldArray.length - 1 - i];
            }

            System.out.println(Arrays.toString(reverseArray));

            System.out.println("Reverse an array in-place");

            for (int i = 0; i < reverseArray.length / 2; i++) {
                int tmp = reverseArray[i];
                reverseArray[i] = reverseArray[reverseArray.length - 1 - i];
                reverseArray[reverseArray.length - 1 - i] = tmp;
            }

            System.out.println(Arrays.toString(reverseArray));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Sort an int array");

            int[] inArray1 = {4, 0, 1, 2, 3, 7, 6, 8, 9, 5};
            Arrays.sort(inArray1);
            System.out.println(Arrays.toString(inArray1));

            System.out.println("----------");

            System.out.println("Sort an int array (manual)");
            int[] inArray2 = {4, 0, 1, 2, 3, 7, 6, 8, 9, 5};
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
            int[] arr = {10, 25, 36, 58, 96, 74, 110};
            System.out.println(Arrays.toString(arr));

            System.out.println("Insert an element in an array and shift (in-place)");

            int insertIndex = 4;
            int insertValue = 55;

            for (int i = arr.length - 1 - 1; i >= insertIndex; i--) {
                arr[i + 1] = arr[i];
            }
            arr[insertIndex] = insertValue;

            System.out.println(Arrays.toString(arr));

            System.out.println("Delete an element in an array and shift (in-place)");

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

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            int findMe = 74;

            int position = Arrays.binarySearch(arr, findMe);
            System.out.println("74: index " + position);

            System.out.println("myBinarySearch() function");

            int position2 = myBinarySearch(arr, 96);
            System.out.println("96: index " + position2);

            int position3 = myBinarySearch(arr, 55);
            System.out.println("55: index " + position3);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Finding the largest element and largest element index");

            double[] doubleArr = { 3.3, 6.8, 2.1, 8.9, 1.0, 7.2};

            //double max = Double.MIN_VALUE; // If we're only searching for max value, this is better.
            double max = doubleArr[0]; // careful! values may be empty
            int maxIndex = 0;
            for (int i = 1; i < doubleArr.length; i++) {
                if (doubleArr[i] > max) {
                    max = doubleArr[i];
                    maxIndex = i;
                }
            }

            System.out.println(maxIndex + ": " + max);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}
