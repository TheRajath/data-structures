package basics;

import java.util.Scanner;

import static basics.InsertNode.insertInitialValues;

public class DeleteNode {

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        CustomLinkedList customLinkedList = insertInitialValues();
        SingleNode head = customLinkedList.head;

        do {

            System.out.println("1. Delete data from the beginning");
            System.out.println("2. Delete data from the end");
            System.out.println("3. Delete data from any position");
            System.out.println("4. Length of the LinkedList");
            System.out.println("5. Show LinkedList");
            System.out.println("6. Exit");

            System.out.println("Enter your choice:");

            if (scanner.hasNextInt()) {

                choice = scanner.nextInt();
            }

            switch (choice) {

                case 1 -> head = customLinkedList.deleteFromBeginning(head);
                case 2 -> head = customLinkedList.deleteFromEnd(head);

                case 3 -> {

                    int position = 0;

                    System.out.println("Enter the position:");

                    if (scanner.hasNextInt()) {

                        position = scanner.nextInt();
                    }

                    head = customLinkedList.deleteFromAnyPosition(head, position);
                }

                case 4 -> {

                    int length = customLinkedList.length(head);

                    System.out.println("Length: " + length);
                }

                case 5 -> customLinkedList.printList(head);

                default -> { // do nothing
                }
            }

        } while (choice != 6);

    }

}
