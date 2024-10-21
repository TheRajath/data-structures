package Array.search;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] array, int size, int element) {

        int left = 0;
        int right = size - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (array[middle] == element)
                return middle;

            if (array[middle] < element)
                left = middle + 1;

            else
                right = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int size = 0;
        int element = 0;

        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter the element to be search:");

        if (scanner.hasNextInt()) {

            element = scanner.nextInt();
        }

        int position = binarySearch(array, size, element);

        if (position != -1) {

            System.out.println("Element found at " + position);

        } else {

            System.out.println("Element not found.");
        }

    }

}
