package LinkedList;

import java.util.Scanner;

public class InsertNode {

    static Scanner scanner = new Scanner(System.in);

    static CustomLinkedList insertInitialValues() {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        for (int i = 5; i > 0; i--) {

            customLinkedList.push(i * 200);
        }

        return customLinkedList;
    }

    static int inputData() {

        int data = 0;

        System.out.println("Enter the data:");

        if (scanner.hasNextInt()) {

            data = scanner.nextInt();
        }

        return data;
    }

    public static void main(String[] args) {

        int choice = 0;

        CustomLinkedList customLinkedList = insertInitialValues();

        do {

            System.out.println("1. Insert data at the beginning");
            System.out.println("2. Insert data at the end");
            System.out.println("3. Length of the LinkedList");
            System.out.println("4. Show LinkedList");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");

            if (scanner.hasNextInt()) {

                choice = scanner.nextInt();
            }

            switch (choice) {

                case 1 -> {

                    int data = inputData();
                    customLinkedList.push(data);
                }

                case 2 -> {

                    int data = inputData();
                    customLinkedList.append(data);
                }

                case 3 -> {

                    int length = customLinkedList.length();

                    System.out.println("Length: " + length);
                }

                case 4 -> customLinkedList.printList();

                default -> { // do nothing
                }
            }

        } while (choice != 5);

    }

}
