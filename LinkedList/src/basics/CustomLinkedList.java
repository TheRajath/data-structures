package basics;

public class CustomLinkedList {

    SingleNode head;

    void push(int newData) {

        SingleNode newNode = new SingleNode(newData);
        newNode.next = head;
        head = newNode;
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

    int length(SingleNode head) {

        int length = 0;

        while(head != null) {

            length++;

            head = head.next;
        }

        return length;
    }

    void printList() {

        SingleNode node = head;

        while (node != null) {

            System.out.print(node.data + " ");

            node = node.next;
        }

        System.out.println();
    }

}
