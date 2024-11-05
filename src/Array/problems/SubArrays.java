package Array.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrays {

    List<Integer> subArrayList(int[] array, long sum) {

//        Given a 1-based indexing array arr[] of integers and an integer sum. You mainly need to return the left and
//        right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray
//        indexes which come first on moving from left to right. If no such subarray exists return an array
//        consisting of element -1.

        int last;
        int start = 0;
        long currentSum = 0;
        int size = array.length;

        boolean flag = false;

        List<Integer> resultingStartAndStopIndices = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            currentSum += array[i];

            if (currentSum >= sum) {

                last = i;

                while (sum < currentSum && start < last) {

                    currentSum -= array[start];
                    ++start;
                }

                if (currentSum == sum) {

                    resultingStartAndStopIndices.add(start + 1);
                    resultingStartAndStopIndices.add(last + 1);

                    flag = true;
                    break;
                }
            }
        }

        if (!flag)
            resultingStartAndStopIndices.add(-1);

        return resultingStartAndStopIndices;
    }

    void displayAllSubArrays(int[] array, int start, int end) {

        if (end == array.length) {

            return;
        }

        if (start > end) {

            displayAllSubArrays(array, 0, end + 1);

        } else {

            System.out.print("[");

            for (int i = start; i < end; i++) {

                System.out.print(array[i] + ", ");
            }

            System.out.println(array[end] + "]");

            displayAllSubArrays(array, start + 1, end);
        }
    }

    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        SubArrays subArrays = new SubArrays();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. First SubArray indices for a Sum");
        System.out.println("2. Display All Sub Arrays");
        System.out.println("\nEnter your choice:");

        int choice = scanner.nextInt();

        int[] array = arrays.inputArray();

        if (choice == 1) {

            System.out.println("Enter the sum: ");
            int sum = scanner.nextInt();

            List<Integer> startAndStopIndices = subArrays.subArrayList(array, sum);

            System.out.println(startAndStopIndices);

        } else {

            subArrays.displayAllSubArrays(array, 0, 0);
        }

    }

}
