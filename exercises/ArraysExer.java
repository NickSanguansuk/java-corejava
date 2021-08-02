package exercises;

import java.util.Arrays;

public class ArraysExer {
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

        // Print with for each loop
        for (int i : intArray1) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Print with toString
        System.out.println(Arrays.toString(intArray2));
    }

    public static void main(String[] args) {

        problem1();
        System.out.println("----------");
    }

}
