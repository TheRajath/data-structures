package basics;

import java.util.Scanner;

public class InsertNode {

    static Scanner scanner = new Scanner(System.in);

    static CustomLinkedList insertInitialValues() {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        for (int i = 20; i > 0; i--) {

            customLinkedList.push(i);
        }

        return customLinkedList;
    }

    private static int getData() {

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

            System.out.println("1. Insert data at the beginning of the LinkedList");
            System.out.println("2. Insert data at the end of the LinkedList");
            System.out.println("3. Show LinkedList");
            System.out.println("4. Length of the LinkedList");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");

            if (scanner.hasNextInt()) {

                choice = scanner.nextInt();
            }

            switch (choice) {

                case 1 -> {

                    int data = getData();
                    customLinkedList.push(data);
                }

                case 2 -> {

                    int data = getData();
                    customLinkedList.append(data);
                }

                case 3 -> customLinkedList.printList(customLinkedList.head);

                case 4 -> {

                    int length = customLinkedList.length(customLinkedList.head);

                    System.out.println("Length: " + length);
                }

                default -> { // do nothing
                }
            }

        } while (choice != 5);

    }

}
