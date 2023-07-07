package basics;

public class CustomLinkedList {

    SingleNode head;

    void push(int newData) {

        SingleNode newNode = new SingleNode(newData);
        newNode.next = head;
        head = newNode;
    }

    SingleNode deleteFromBeginning(SingleNode head) {

        return head.next;
    }

    void append(int newData) {

        SingleNode newNode = new SingleNode(newData);

        if (head == null) {

            head = newNode;
        }

        SingleNode last = head;

        while (last.next != null) {

            last = last.next;
        }

        last.next = newNode;
    }

    SingleNode deleteFromEnd(SingleNode head) {

        SingleNode end = head;
        SingleNode previous = null;

        while (end.next != null) {

            previous = end;
            end = end.next;
        }

        if (previous == null) {

            throw new ArrayIndexOutOfBoundsException("Linked List is Empty");
        }

        previous.next = null;

        return head;
    }

    SingleNode reverse(SingleNode node) {

        SingleNode previous = null;
        SingleNode current = node;
        SingleNode next;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        node = previous;

        return node;
    }

    int length(SingleNode head) {

        int length = 0;

        while (head != null) {

            length++;

            head = head.next;
        }

        return length;
    }

    void printList(SingleNode head) {

        if (head == null) {

            throw new ArrayIndexOutOfBoundsException("Linked List is Empty");
        }

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;
        }

        System.out.println();
    }

}
