package LinkedList;

import static LinkedList.DoublyLinkedListBasics.initializeDoublyLinkedList;
import static LinkedList.InsertNode.inputData;

public class DeleteNodeDoublyLinkedList {

    public static void main(String[] args) {

        int data = inputData();

        DoublyLinkedList doublyLinkedList = initializeDoublyLinkedList();
        DoubleNode nodeToDelete = doublyLinkedList.findNode(data);

        doublyLinkedList.deleteNode(nodeToDelete);
        doublyLinkedList.printList();
    }

}
