package basics;

import java.util.Scanner;

public class Rotation {

    private static int[] rotateOneByOne(int[] array, int size, int numberOfTimesToRotate) {

        int position = 1;

        while (position <= numberOfTimesToRotate) {

            int last = array[0];

            for (int i = 0; i < size - 1; i++) {

                array[i] = array[i + 1];
            }

            array[size - 1] = last;

            position++;
        }

        return array;
    }

    public static void main(String[] args) {

        int size = 0;
        int numberOfTimesToRotate = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");

        if (scanner.hasNextInt()) {

            size = scanner.nextInt();
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {

            if (scanner.hasNextInt()) {

                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of times to rotate:");

        if (scanner.hasNextInt()) {

            numberOfTimesToRotate = scanner.nextInt();
        }

        int[] rotatedArray = rotateOneByOne(array, size, numberOfTimesToRotate);

        System.out.println("Rotated Array:");

        for (int i = 0; i < size; i++) {

            System.out.print(rotatedArray[i] + " ");
        }

    }

}
