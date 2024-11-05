package Array.problems;

import java.util.Scanner;

public class MissingNumber {

    /*Given an array arr[] of size n-1 with integers in the range of [1, n], the task is to
    find the missing number from the first N integers.

    Note: There are no duplicates in the list.*/

    int findTheMissingElement(int[] array, int size) {

        int sum = 0;

        for (int i = 0; i < size - 1; i++) {

            sum += array[i];
        }

        int actualSum = (size * (size + 1)) / 2;

        System.out.println(actualSum);
        System.out.println(sum);

        return actualSum - sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = arrayReadAndWrite.inputArrayWithSize(size - 1);

        int theMissingElement = new MissingNumber().findTheMissingElement(array, size);

        if (theMissingElement == 0) {

            System.out.println("The element is already present in the array");

        } else {

            System.out.println("The missing element is: " + theMissingElement);
        }

    }

}
