package Array.problems;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    /*Given an array of positive and negative numbers, the task is to find if there is a subarray
    (of size at least one) with 0 sum.*/

    boolean checkIfSubArrayHasZeroSum(int[] array) {

        Set<Integer> sumSet = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

            if (array[i] == 0 || sum == 0 || sumSet.contains(sum)) {

                return true;
            }

            sumSet.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        int[] array = arrayReadAndWrite.inputArray();

        boolean subArrayHasZeroSum = new SubArrayWithZeroSum().checkIfSubArrayHasZeroSum(array);

        if (subArrayHasZeroSum) {

            System.out.println("Found a subarray with 0 sum");

        } else {

            System.out.println("No such Sub Array Exists!");
        }

    }

}
