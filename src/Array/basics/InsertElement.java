package Array.basics;

import Array.problems.ArrayReadAndWrite;

import java.util.Scanner;

public class InsertElement {

    void insertElementInSortedArray(int[] array, int size, int element) {

        int i;

        for (i = size - 1; (i >= 0 && array[i] > element); i--) {

            array[i + 1] = array[i];
        }

        array[i + 1] = element;
    }

    void insertElementInUnsortedArray(int[] array, int size, int element, int position) {

        for (int i = size - 1; i >= position; i--) {

            array[i + 1] = array[i];
        }

        array[position] = element;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InsertElement insertElement = new InsertElement();
        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        System.out.println("1. Insert in sorted Array");
        System.out.println("2. Insert in un-sorted Array");
        System.out.println("Enter your choice:");

        int choice = scanner.nextInt();

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int sizeWithExtraElement = size + 1;
        int[] array = new int[sizeWithExtraElement];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be insert:");
        int element = scanner.nextInt();

        int position = 0;

        if (1 == choice) {

            insertElement.insertElementInSortedArray(array, size, element);

        } else {

            System.out.println("Enter the position at which it should be inserted:");

            if (scanner.hasNextInt()) {

                position = scanner.nextInt();
            }

            insertElement.insertElementInUnsortedArray(array, size, element, position);
        }

        System.out.println("Array after inserting " + element + " at position " + position);
        arrayReadAndWrite.printArrayWithSize(array, sizeWithExtraElement);
    }

}
