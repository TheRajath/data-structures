package Array.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithEqualZeroAndOne {

    /*Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having
    an equal number of 0’s and 1’s.*/

    int countSubArrays(int[] array) {

        int sum = 0;
        int count = 0;
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        List<CustomPair> subArrays = new ArrayList<>();

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                array[i] = -1;
            }

            sum += array[i];

            // If the cumulative sum has been seen before, all subArrays between previous indices and current
            // index have a balanced sum
            if (sumMap.containsKey(sum)) {
                // For each occurrence of this cumulative sum, add a new subarray with balanced sum
                for (int index : sumMap.get(sum)) {
                    subArrays.add(new CustomPair(index + 1, i));
                    count++;
                }
            }

            // Add the current index to the list of indices for this cumulative sum in the map
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        // Print the subArrays with equal number of 0's and 1's
        System.out.println("Subarrays with equal number of 0's and 1's: " + subArrays);

        return count;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        int count = new SubArrayWithEqualZeroAndOne().countSubArrays(array);

        System.out.println("Count of subArrays with equal number of 1’s and 0’s are: " + count);

    }

}
