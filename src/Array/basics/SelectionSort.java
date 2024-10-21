package Array.basics;

import java.util.Scanner;

public class SelectionSort {

    private static void selectionSort(int[] array, int size) {

        for (int i = 0; i < size - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < size; j++) {

                if (array[j] < array[minimumIndex]) {

                    minimumIndex = j;
                }
            }

            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        int size = 0;

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

        System.out.println("Sorted array:");

        selectionSort(array, size);

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
