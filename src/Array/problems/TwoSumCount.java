package Array.problems;

import java.util.*;

public class TwoSumCount {

    /*Given an array arr[] of n integers and a target value, the task is to find the number of pairs of integers in
    the array whose sum is equal to target.*/

    int countPairs(int[] array, int target) {

        Map<Integer, Integer> frequency = new HashMap<>();
        List<CustomPair> pairs = new ArrayList<>();
        int count = 0;

        for (int i : array) {

            if (frequency.containsKey(target - i)) {

                int occurrences = frequency.get(target - i);
                count += occurrences;

                for (int j = 0; j < occurrences; j++) {

                    pairs.add(new CustomPair(target - i, i));
                }
            }

            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }

        System.out.println("Pairs with sum " + target + " are: " + pairs);

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        System.out.println("Enter the target value to find the pairs with the sum: ");
        int target = scanner.nextInt();

        int count = new TwoSumCount().countPairs(array, target);

        System.out.println(count);
    }

}
