package Array.basics;

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

        DeleteElement deleteElement = new DeleteElement();

        int size = 0;
        int element = 0;
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Delete in sorted Array");
        System.out.println("2. Delete in un-sorted Array");
        System.out.println("Enter your choice:");

        if (scanner.hasNextInt()) {

            choice = scanner.nextInt();
        }

        System.out.println("Enter the size of the array:");

        if (scanner.hasNextInt()) {

            size = scanner.nextInt();
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {

            if (scanner.hasNextInt()) {

                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element to be deleted:");

        if (scanner.hasNextInt()) {

            element = scanner.nextInt();
        }

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
