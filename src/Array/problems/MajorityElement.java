package Array.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*Given an array arr. Find the majority element in the array. If no majority exists, return -1. A majority
    element in an array is an element that appears strictly more than arr.size() / 2 times in the array.*/

    int findMajorityElement(int[] array) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : array) {

            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);

            if (frequencyMap.get(number) > array.length / 2) {

                return number;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        int majorityElement = new MajorityElement().findMajorityElement(array);

        System.out.println("Majority element: " + majorityElement);
    }

}
