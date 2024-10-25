package Array.problems;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

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
