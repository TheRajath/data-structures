package Array.problems;

public class DutchNationalFlag {

    /*Given an array arr[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e., put all 0s first,
    then all 1s and all 2s in last.

    This problem is the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra.
    The problem is as follows:

    Given n balls of colour red, white or blue arranged in a line in random order.
    You have to arrange all the balls such that the balls with the same colours are adjacent with the order of
    the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first
    then the white coloured balls and then the blue coloured balls).*/

    void sortedArray012(int[] array) {

        int i;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                zeroCount++;

            } else if (array[i] == 1) {

                oneCount++;

            } else {

                twoCount++;
            }
        }

        int index = 0;

        for (i = 0; i < zeroCount; i++) {

            array[index++] = 0;
        }

        for (i = 0; i < oneCount; i++) {

            array[index++] = 1;
        }

        for (i = 0; i < twoCount; i++) {

            array[index++] = 2;
        }

    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayOperations = new ArrayReadAndWrite();

        int[] array = arrayOperations.inputArray();

        new DutchNationalFlag().sortedArray012(array);

        arrayOperations.printArray(array);
    }

}
