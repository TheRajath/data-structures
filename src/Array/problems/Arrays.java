package Array.problems;

import java.util.Scanner;

public class Arrays {

    Scanner scanner;

    int[] inputArray() {

        scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextInt();
        }

        return array;
    }

    void printArray(int[] array) {

        for (int element : array) {

            System.out.print(element + " ");
        }

        System.out.println();
    }
}
