package basics;

import java.util.Scanner;

public class SubArrays {

    private static void subArrays(int[] array, int start, int end) {

        if (end == array.length) {

            return;
        }

        if (start > end) {

            subArrays(array, 0, end + 1);

        } else {

            System.out.print("[");

            for (int i = start; i < end; i++) {

                System.out.print(array[i] + ", ");
            }

            System.out.println(array[end] + "]");

            subArrays(array, start + 1, end);
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

        subArrays(array, 0, 0);
    }

}
