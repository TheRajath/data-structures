package basics;

import java.util.Scanner;

public class ElementSearch {

    private static int elementSearch(int[] array, int size, int element) {

        for (int i = 0; i < size; i++) {

            if (array[i] == element)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int size = 0;
        int element = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        if (scanner.hasNextInt()) {

            size = scanner.nextInt();
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {

            if (scanner.hasNextInt()) {

                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element to be search: ");

        if (scanner.hasNextInt()) {

            element = scanner.nextInt();
        }

        int position = elementSearch(array, size, element);

        if (position != -1) {

            System.out.println("Element found at " + position);

        } else {

            System.out.println("Element not found");
        }
    }
}
