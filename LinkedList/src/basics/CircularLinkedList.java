package basics;

public class CircularLinkedList {

    SingleNode head;

    void push(int data) {

        var newNode = new SingleNode(data);

        if (head == null) {

            head = newNode;
            head.next = head;

        } else {

            SingleNode current = head;

            while (current.next != head) {

                current = current.next;
            }

            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
    }

    void insertNodeAtEnd(int data) {

        var newNode = new SingleNode(data);

        if (head == null) {

            head = newNode;
            head.next = head;

        } else {

            SingleNode current = head;

            while (current.next != head) {

                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
        }
    }

    void printList() {

        SingleNode current = head;

        if (current == null) {

            throw new ArrayIndexOutOfBoundsException("Linked List is Empty");
        }

        do {

            System.out.print(current.data);

            current = current.next;

            if (current != head) {

                System.out.print(" -> ");
            }

        } while (current != head);

        System.out.println();
    }

}
