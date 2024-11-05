package Array.problems;

import java.util.Scanner;

public class ArrayReadAndWrite {

    Scanner scanner = new Scanner(System.in);

    public int[] inputArray() {

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void printArray(int[] array) {

        for (int element : array) {

            System.out.print(element + " ");
        }

        System.out.println();
    }

    public void printArrayWithSize(int[] array, int size) {

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

}
