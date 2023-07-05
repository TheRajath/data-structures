package basics;

import java.util.Scanner;

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

        for (int position = 0; position < numberOfTimesToRotate; position++) {

            int last = array[arrayLength];

            for (int i = arrayLength; i > 0; i--) {

                array[i] = array[i - 1];
            }

            array[0] = last;

        }

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
        System.out.println("Enter your choice:");

        if (scanner.hasNextInt()) {

            choice = scanner.nextInt();
        }

        int[] rotatedArray = new int[100];

        switch (choice) {
            case 1 -> rotatedArray = leftRotate(array, size, numberOfTimesToRotate);
            case 2 -> rotatedArray = rightRotate(array, size, numberOfTimesToRotate);
            default -> System.exit(0);
        }

        System.out.println("Rotated Array:");

        for (int i = 0; i < size; i++) {

            System.out.print(rotatedArray[i] + " ");
        }

    }

}
