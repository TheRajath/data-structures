package Array.basics;

import Array.problems.ArrayReadAndWrite;

public class ReverseArray {

    private int[] reverseArray(int[] array, int size) {

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

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        int[] reversedArray = new ReverseArray().reverseArray(array, array.length);

        System.out.println("Reversed Array:");
        arrayReadAndWrite.printArray(reversedArray);
    }

}
