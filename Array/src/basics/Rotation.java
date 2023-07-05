package basics;

import java.util.Scanner;

import static java.lang.System.arraycopy;

public class Rotation {

    private static int[] leftRotate(int[] array, int size, int numberOfTimesToRotate) {

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

    private static int[] rightRotate(int[] array, int size, int numberOfTimesToRotate) {

        int arrayLength = size - 1;

        for (int timesToRotate = 0; timesToRotate < numberOfTimesToRotate; timesToRotate++) {

            int last = array[arrayLength];

            for (int i = arrayLength; i > 0; i--) {

                array[i] = array[i - 1];
            }

            array[0] = last;

        }

        return array;
    }

    private static int[] rightRotateUsingTemporaryArray(int[] array, int size, int numberOfTimesToRotate) {

        int[] temporary = new int[size];

        int current = 0;

        for (int i = numberOfTimesToRotate; i < size; i++) {

            temporary[current] = array[i];
            current++;
        }

        for (int i = 0; i < numberOfTimesToRotate; i++) {

            temporary[current] = array[i];
            current++;
        }

        arraycopy(temporary, 0, array, 0, size);

        return array;
    }

    public static void main(String[] args) {

        int size = 0;
        int choice = 0;
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

        System.out.println("1. Left Rotate");
        System.out.println("2. Right Rotate");
        System.out.println("3. Right Rotate using temporary array");
        System.out.println("Enter your choice:");

        if (scanner.hasNextInt()) {

            choice = scanner.nextInt();
        }

        int[] rotatedArray = switch (choice) {
            case 1 -> leftRotate(array, size, numberOfTimesToRotate);
            case 2 -> rightRotate(array, size, numberOfTimesToRotate);
            case 3 -> rightRotateUsingTemporaryArray(array, size, numberOfTimesToRotate);
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        System.out.println("Rotated Array:");

        for (int i = 0; i < size; i++) {

            System.out.print(rotatedArray[i] + " ");
        }

    }

}
