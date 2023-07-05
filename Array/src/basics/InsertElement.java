package basics;

import java.util.Scanner;

public class InsertElement {

    private static void insertElementAtSpecificPosition(int[] array, int size, int element, int position) {

        for (int i = size - 1; i >= position; i--) {

            array[i + 1] = array[i];
        }

        array[position] = element;
    }

    public static void main(String[] args) {

        int size = 0;
        int element = 0;
        int position = 0;

        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter the position at which it should be inserted:");

        if (scanner.hasNextInt()) {

            position = scanner.nextInt();
        }

        insertElementAtSpecificPosition(array, size, element, position);

        System.out.println("Array after inserting " + element + " at position " + position);

        for (int i = 0; i < sizeWithExtraElement; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
