package Array.problems;

public class DutchNationalFlag {

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

        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();
        Arrays arrayOperations = new Arrays();

        int[] array = arrayOperations.inputArray();

        dutchNationalFlag.sortedArray012(array);

        arrayOperations.printArray(array);
    }

}
