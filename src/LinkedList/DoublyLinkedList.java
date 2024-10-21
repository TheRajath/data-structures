package LinkedList;

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

    void addNodeBeforeGivenNode(DoubleNode nextNode, int newData) {

        if (nextNode == null) {

            throw new ArrayIndexOutOfBoundsException("Previous Node is null");
        }

        DoubleNode newNode = new DoubleNode(newData);

        newNode.previous = nextNode.previous;
        nextNode.previous = newNode;
        newNode.next = nextNode;

        if (newNode.previous != null) {

            newNode.previous.next = newNode;

        } else {

            head = newNode;
        }
    }

    void addNodeAfterGivenNode(DoubleNode previousNode, int newData) {

        if (previousNode == null) {

            throw new ArrayIndexOutOfBoundsException("Previous Node is null");
        }

        DoubleNode newNode = new DoubleNode(newData);

        newNode.next = previousNode.next;
        previousNode.next = newNode;
        newNode.previous = previousNode;

        if (newNode.next != null) {

            newNode.next.previous = newNode;
        }
    }

    void deleteNode(DoubleNode nodeToDelete) {

        if (head == null || nodeToDelete == null) {

            throw new ArrayIndexOutOfBoundsException("List or the Node is null");
        }

        if (head == nodeToDelete)
            head = nodeToDelete.next;

        if (nodeToDelete.next != null)
            nodeToDelete.next.previous = nodeToDelete.previous;

        if (nodeToDelete.previous != null)
            nodeToDelete.previous.next = nodeToDelete.next;
    }

    DoubleNode findNode(int dataToFind) {

        DoubleNode current = head;

        while (current != null) {

            if (current.data == dataToFind) {

                return current;
            }

            current = current.next;
        }

        throw new ArrayIndexOutOfBoundsException("Data Not found");
    }

    int length() {

        DoubleNode current = head;

        int length = 0;

        while (current != null) {

            length++;
            current = current.next;
        }

        return length;
    }

    void reverse() {

        DoubleNode temp = null;
        DoubleNode current = head;

        while (current != null) {

            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        if (temp != null) {

            head = temp.previous;
        }
    }

    void printList() {

        DoubleNode current = head;

        if (current == null) {

            throw new ArrayIndexOutOfBoundsException("Linked List is Empty");
        }

        while (current != null) {

            System.out.print(current.data);

            current = current.next;

            if (current != null) {

                System.out.print(" <-> ");
            }
        }

        System.out.println();
    }

}
