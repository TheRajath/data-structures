package Array.problems;

public class WaveSorting {

    /*Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is
    sorted in wave form if:
    arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..*/

    void swap(int[] array, int a, int b) {

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    void sortInWave(int[] array) {

        int size = array.length;

        for (int i = 0; i < size; i += 2) {

            if (i > 0 && array[i - 1] > array[i]) {

                swap(array, i, i - 1);
            }

            if (i < size - 1 && array[i + 1] > array[i]) {

                swap(array, i, i + 1);
            }
        }
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        new WaveSorting().sortInWave(array);

        System.out.println("Array after sorting in a wave format");
        arrayReadAndWrite.printArray(array);
    }

}
