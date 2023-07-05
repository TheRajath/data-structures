package basics;

import java.util.Scanner;

import static basics.SearchElement.elementSearch;

public class DeleteElement {

    private static int deleteElement(int[] array, int size, int element) {

        int position = elementSearch(array, size, element);

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

        System.out.println("Enter the element to be deleted:");

        if (scanner.hasNextInt()) {

            element = scanner.nextInt();
        }

        var sizeAfterDeletion = deleteElement(array, size, element);

        System.out.println("Array after deleting " + element);

        for (int i = 0; i < sizeAfterDeletion; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
