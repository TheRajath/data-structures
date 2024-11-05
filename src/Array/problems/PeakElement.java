package Array.problems;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

    /*Given an unsorted array, find a peak element in it.
    An element is considered to be peak if its value is greater than or equal to the values of
    its adjacent elements (if they exist). There can be more than one peak elements in an array, we return any of them

    Note: If the array is increasing then just print the last element will be the maximum value.*/

    List<Integer> findPeakElementIndexes(int[] array) {

        int length = array.length;
        List<Integer> peakElements = new ArrayList<>();

        if (length == 1) {

            peakElements.add(0);
            return peakElements;
        }

        if (array[0] >= array[1])
            peakElements.add(0);

        if (array[length - 1] >= array[length - 2])
            peakElements.add(length - 1);

        for (int i = 1; i < length - 1; i++) {

            if (array[i] >= array[i - 1] && array[i] >= array[i + 1])
                peakElements.add(i);
        }
        return peakElements;
    }

    public static void main(String[] args) {

        Arrays arrayOperations = new Arrays();

        int[] array = arrayOperations.inputArray();

        List<Integer> peakElementIndexes = new PeakElement().findPeakElementIndexes(array);

        System.out.println("Peak element indexes are: " + peakElementIndexes);
    }

}
