package Array.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    /*Given an array of integers of size N, the task is to find the first non-repeating element in this array.*/

    int getFirstNonRepeatingElement(int[] array) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : array) {

            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() == 1) {

                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        int firstNonRepeatingElement = new FirstNonRepeatingElement().getFirstNonRepeatingElement(array);

        System.out.println("First non repeating element: " + firstNonRepeatingElement);

    }

}
