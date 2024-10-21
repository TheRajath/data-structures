package Array.basics;

import java.util.Scanner;

public class ReverseArray {

    private static int[] reverseArray(int[] array, int size) {

        int temp;

        int start = 0;
        int end = size - 1;

        while (start < end) {

            temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }

        return array;
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

        int[] reversedArray = reverseArray(array, size);

        System.out.println("Reversed Array:");

        for (int i = 0; i < size; i++) {

            System.out.print(reversedArray[i] + " ");
        }

    }

}
