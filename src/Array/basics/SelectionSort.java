package Array.basics;

import Array.problems.ArrayReadAndWrite;

public class SelectionSort {

    private void selectionSort(int[] array, int size) {

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

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        System.out.println("Sorted array:");

        new SelectionSort().selectionSort(array, array.length);

        arrayReadAndWrite.printArray(array);
    }

}
