package basics;

import java.util.Scanner;

import static basics.InsertNode.inputData;

public class CircularLinkedListBasics {

    static CircularLinkedList initializeCircularLinkedList() {

        var circularLinkedList = new CircularLinkedList();
        circularLinkedList.push(1000);
        circularLinkedList.push(800);
        circularLinkedList.push(600);
        circularLinkedList.push(400);
        circularLinkedList.push(200);

        return circularLinkedList;
    }

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        CircularLinkedList circularLinkedList = initializeCircularLinkedList();

        do {

            System.out.println("1. Insert data at the beginning");
            System.out.println("2. Insert data at the end of the list");
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
                    circularLinkedList.push(data);
                }

                case 2 -> {

                    int data = inputData();
                    circularLinkedList.insertNodeAtEnd(data);
                }

                case 3 -> {

                    int length = circularLinkedList.getLength();

                    System.out.println("Length: " + length);
                }

                case 4 -> circularLinkedList.printList();

                default -> { // do nothing
                }

            }

        } while (choice != 5);
    }

}
