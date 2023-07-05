package basics;

import java.util.Scanner;

public class InsertNode {

    static Scanner scanner = new Scanner(System.in);

    private static void insertInitialValues(CustomLinkedList customLinkedList) {

        for (int i = 0; i < 20; i++) {

            customLinkedList.push(i);
        }
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

        CustomLinkedList customLinkedList = new CustomLinkedList();

        insertInitialValues(customLinkedList);

        do {

            System.out.println("1. Insert data at the beginning of the LinkedList");
            System.out.println("2. Insert data at the end of the LinkedList");
            System.out.println("3. Show LinkedList");
            System.out.println("4. Exit");

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

                case 3 -> customLinkedList.printList();

                default -> { // do nothing
                }
            }

        } while (choice != 4);

    }

}
