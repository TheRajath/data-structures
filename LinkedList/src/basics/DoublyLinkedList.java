package basics;

public class DoublyLinkedList {

    DoubleNode head;

    void push(int newData) {

        DoubleNode newNode = new DoubleNode(newData);
        newNode.next = head;

        if (head != null) {

            head.previous = newNode;
        }

        head = newNode;
    }

}
