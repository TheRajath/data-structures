package basics;

import java.util.Scanner;

import static basics.InsertNode.inputData;

public class DoublyLinkedListBasics {

    static DoublyLinkedList initializeDoublyLinkedList() {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        for (int i = 5; i > 0; i--) {

            doublyLinkedList.push(i * 200);
        }

        return doublyLinkedList;
    }

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList doublyLinkedList = initializeDoublyLinkedList();

        do {

            System.out.println("1. Insert data at the beginning");
            System.out.println("2. Insert data after a given Node");
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
                    doublyLinkedList.push(data);
                }

                case 2 -> {

                    int data = inputData();

                    System.out.println("Enter the Node to insert " + data + " after: ");
                    int nodeData = scanner.nextInt();

                    DoubleNode previousNode = doublyLinkedList.findNode(nodeData);

                    doublyLinkedList.addNodeAfterGivenNode(previousNode, data);
                }

                case 3 -> {

                    int length = doublyLinkedList.length();

                    System.out.println("Length: " + length);
                }

                case 4 -> doublyLinkedList.printList();

                default -> { // do nothing
                }

            }


        } while (choice != 5);

    }

}
