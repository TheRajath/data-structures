package Array.basics;

import java.util.Scanner;

public class InsertElement {

    private static void insertElementInSortedArray(int[] array, int size, int element) {

        int i;

        for (i = size - 1; (i >= 0 && array[i] > element); i--) {

            array[i + 1] = array[i];
        }

        array[i + 1] = element;
    }

    private static void insertElementInUnsortedArray(int[] array, int size, int element, int position) {

        for (int i = size - 1; i >= position; i--) {

            array[i + 1] = array[i];
        }

        array[position] = element;
    }

    public static void main(String[] args) {

        int size = 0;
        int element = 0;
        int position = 0;
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Insert in sorted Array");
        System.out.println("2. Insert in un-sorted Array");
        System.out.println("Enter your choice:");

        if (scanner.hasNextInt()) {

            choice = scanner.nextInt();
        }

        System.out.println("Enter the size of the array:");

        if (scanner.hasNextInt()) {

            size = scanner.nextInt();
        }

        int sizeWithExtraElement = size + 1;

        int[] array = new int[sizeWithExtraElement];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {

            if (scanner.hasNextInt()) {

                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element to be insert:");

        if (scanner.hasNextInt()) {

            element = scanner.nextInt();
        }

        if (1 == choice) {

            insertElementInSortedArray(array, size, element);

        } else {

            System.out.println("Enter the position at which it should be inserted:");

            if (scanner.hasNextInt()) {

                position = scanner.nextInt();
            }

            insertElementInUnsortedArray(array, size, element, position);
        }

        System.out.println("Array after inserting " + element + " at position " + position);

        for (int i = 0; i < sizeWithExtraElement; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
