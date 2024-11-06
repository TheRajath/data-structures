package Array.problems;

import java.util.HashSet;
import java.util.Set;

public class SubsetArray {

    /*Given two arrays arr1[] and arr2[] of size m and n respectively, the task is to determine whether arr2[]
    is a subset of arr1[]. Both arrays are not sorted, and elements are distinct.*/

    boolean containsSubset(int[] array1, int[] array2) {

        Set<Integer> numberSet = new HashSet<>();

        for (int number : array1) {

            numberSet.add(number);
        }

        for (int number : array2) {

            if (!numberSet.contains(number)) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayReadAndWrite arrayReadAndWrite = new ArrayReadAndWrite();

        System.out.println("Enter details of array 1:");
        int[] array1 = arrayReadAndWrite.inputArray();

        System.out.println("\nEnter details of array 2:");
        int[] array2 = arrayReadAndWrite.inputArray();

        boolean isSubset = new SubsetArray().containsSubset(array1, array2);

        if (isSubset) {

            System.out.println("\nArray 2 is subset of array 1");

        } else {

            System.out.println("\nArray 2 is not a subset of array 1");
        }

    }

}
