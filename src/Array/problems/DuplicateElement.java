package Array.problems;

import java.util.*;

public class DuplicateElement {

    /*Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number
    of times. Find these repeating numbers in O(n) and use only constant memory space.

    Note: The repeating element should be printed only once.*/

    List<Integer> findDuplicateElements(int[] array) {

        Map<Long, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicateElements = new ArrayList<>();

        for (long number : array) {

            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Long, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() > 1) {

                duplicateElements.add(Math.toIntExact(entry.getKey()));
            }
        }

        if (duplicateElements.isEmpty()) {

            duplicateElements.add(-1);
        }

        Collections.sort(duplicateElements);

        return duplicateElements;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();
        int[] array = arrayReadAndWrite.inputArray();

        List<Integer> allDuplicateElements = new DuplicateElement().findDuplicateElements(array);

        System.out.println("Duplicate elements found are:");

        for (int element: allDuplicateElements) {

            System.out.println(element + " ");
        }

    }

}
