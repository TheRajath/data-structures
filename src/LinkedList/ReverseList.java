package LinkedList;

import static LinkedList.DoublyLinkedListBasics.initializeDoublyLinkedList;
import static LinkedList.InsertNode.insertInitialValues;

public class ReverseList {

    public static void main(String[] args) {

        CustomLinkedList customLinkedList = insertInitialValues();

        System.out.println("Singly LinkedList");
        System.out.println("Original:");
        customLinkedList.printList();

        System.out.println("Reversed:");
        customLinkedList.reverse();
        customLinkedList.printList();

        System.out.println("\nDoubly LinkedList");
        DoublyLinkedList doublyLinkedList = initializeDoublyLinkedList();

        System.out.println("Original:");
        doublyLinkedList.printList();

        System.out.println("Reverse:");
        doublyLinkedList.reverse();
        doublyLinkedList.printList();
    }

}
