package LinkedList;

import java.util.Scanner;

import static LinkedList.InsertNode.inputData;

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
            System.out.println("2. Insert data before a given Node");
            System.out.println("3. Insert data after a given Node");
            System.out.println("4. Length of the LinkedList");
            System.out.println("5. Show LinkedList");
            System.out.println("6. Exit");

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

                    doublyLinkedList.addNodeBeforeGivenNode(previousNode, data);
                }

                case 3 -> {

                    int data = inputData();

                    System.out.println("Enter the Node to insert " + data + " after: ");
                    int nodeData = scanner.nextInt();

                    DoubleNode previousNode = doublyLinkedList.findNode(nodeData);

                    doublyLinkedList.addNodeAfterGivenNode(previousNode, data);
                }

                case 4 -> {

                    int length = doublyLinkedList.length();

                    System.out.println("Length: " + length);
                }

                case 5 -> doublyLinkedList.printList();

                default -> { // do nothing
                }

            }

        } while (choice != 6);

    }

}
