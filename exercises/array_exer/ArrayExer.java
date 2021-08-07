package exercises.array_exer;

import java.util.Arrays;

public class ArrayExer {
    // Core Java - Exercises - Arrays

    static void problem1() {
        System.out.println("Problem 1: ");
        // Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.

        int[] intArray1 = new int[3];
        intArray1[0] = 1;
        intArray1[1] = 2;
        intArray1[2] = 3;

        int[] intArray2 = { 1, 2, 3 };

        int[] intArray3 = new int[]{ 1, 2, 3 };

        // Print with for each loop
        for (int i : intArray1) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Print with toString
        System.out.println(Arrays.toString(intArray1));
    }

    static void problem2() {
        System.out.println("Problem 2: ");
        // Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int[] intArray = {13, 5, 7, 68, 2};
        System.out.println(intArray[intArray.length / 2]);
    }

    static void problem3() {
        System.out.println("Problem 3: ");
        // Write a program that creates an array of String type
        // and initializes it with the strings “red”, “green”, “blue” and “yellow”.
        // Print out the array length. Make a copy using the clone( ) method.
        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

        String[] strArray = {"red", "green", "blue", "yellow"};
        System.out.println("length: " + strArray.length);

        String[] strArrayClone = strArray.clone();

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArrayClone));
    }

    static void problem4() {
        System.out.println("Problem 4: ");
        // Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.
        // Print out the value at the first index and the last index using length - 1 as the index.
        // Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
        // Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5. You should get the same type of exception.

        int[] intArray = {2, 4, 6, 8, 10};

        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length - 1]);

        // exceptions
        //System.out.println(intArray[intArray.length]);
        //intArray[5] = 20;
    }

    static void problem5() {
        System.out.println("Problem 5: ");
        // Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        System.out.println(Arrays.toString(intArray));
    }

    static void problem6() {
        System.out.println("Problem 6: ");
        // Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }

        System.out.println(Arrays.toString(intArray));
    }

    static void problem7() {
        System.out.println("Problem 7: ");
        // Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element, except for the middle (index 2) element.

        double[] doubleArray = {11.1, 33.3, 55.5, 77.7, 99.9};

        for (int i = 0; i < doubleArray.length; i++) {
            if (i == (doubleArray.length / 2)) {
                continue;
            }
            System.out.print(doubleArray[i] + ", ");
        }

        System.out.println();
    }

    static void problem8() {
        System.out.println("Problem 8: ");
        // Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.

        double[] doubleArray = {11.1, 33.3, 55.5, 77.7, 99.9};

        double tmp = doubleArray[0];
        doubleArray[0] = doubleArray[doubleArray.length / 2];
        doubleArray[doubleArray.length / 2] = tmp;

        System.out.println(Arrays.toString(doubleArray));
    }

    static void problem9() {
        System.out.println("Problem 9: ");
        // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        // Print the array in ascending order, print the smallest and the largest element of the array.
        // The output will look like the following:
        //      - Array in ascending order: 0, 1, 2, 4, 9, 13
        //      - The smallest number is 0
        //      - The biggest number is 13

        int[] intArray = {4, 2, 9, 13, 1, 0};
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Array in ascending order: " + Arrays.toString(intArray));
        System.out.println("The smallest number is: " + intArray[0]);
        System.out.println("The biggest number is: " + intArray[intArray.length - 1]);
    }

    static void problem10() {
        System.out.println("Problem 10: ");
        // Create an array that includes an integer, 3 strings, and 1 double. Print the array.

        Object[] objArray = new Object[5];
        objArray[0] = 4;
        objArray[1] = "Wasin";
        objArray[2] = "Sang";
        objArray[3] = "Nick";
        objArray[4] = 5.0;

        Object[] objArray2 = {4, "Wasin", "Sang", "Nick", 5.0};

        System.out.println(Arrays.toString(objArray));
        System.out.println(Arrays.toString(objArray2));
    }

    public static void main(String[] args) {

        problem1();
        System.out.println("----------");
        problem2();
        System.out.println("----------");
        problem3();
        System.out.println("----------");
        problem4();
        System.out.println("----------");
        problem5();
        System.out.println("----------");
        problem6();
        System.out.println("----------");
        problem7();
        System.out.println("----------");
        problem8();
        System.out.println("----------");
        problem9();
        System.out.println("----------");
        problem10();
        System.out.println("----------");
    }

}
