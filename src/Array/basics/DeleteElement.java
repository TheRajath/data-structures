package Array.basics;

import Array.problems.ArrayReadAndWrite;

import java.util.Scanner;

import static Array.search.BinarySearch.binarySearch;
import static Array.search.LinearSearch.elementSearch;

public class DeleteElement {

    int deleteElementInSortedArray(int[] array, int size, int element) {

        int position = binarySearch(array, size, element);

        return deleteElement(array, size, position);
    }

    int deleteElementInUnsortedArray(int[] array, int size, int element) {

        int position = elementSearch(array, size, element);

        return deleteElement(array, size, position);
    }

    private int deleteElement(int[] array, int size, int position) {

        if (position == -1) {

            System.out.println("Element Not Found");
            System.exit(0);
        }

        for (int i = position; i < size - 1; i++) {

            array[i] = array[i + 1];
        }

        return size - 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DeleteElement deleteElement = new DeleteElement();
        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        System.out.println("1. Delete in sorted Array");
        System.out.println("2. Delete in un-sorted Array");
        System.out.println("\nEnter your choice:");

        int choice = scanner.nextInt();

        int[] array = arrayReadAndWrite.inputArray();
        int size = array.length;

        System.out.println("Enter the element to be deleted:");
        int element = scanner.nextInt();

        int sizeAfterDeletion;

        if (1 == choice) {

            sizeAfterDeletion = deleteElement.deleteElementInSortedArray(array, size, element);

        } else {

            sizeAfterDeletion = deleteElement.deleteElementInUnsortedArray(array, size, element);
        }

        System.out.println("Array after deleting " + element);

        for (int i = 0; i < sizeAfterDeletion; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
