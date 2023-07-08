package basics;

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

        DoublyLinkedList doublyLinkedList = initializeDoublyLinkedList();

        int data = inputData();

        doublyLinkedList.push(data);
    }

}
