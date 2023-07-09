package basics;

public class CustomLinkedList {

    SingleNode head;

    void push(int newData) {

        SingleNode newNode = new SingleNode(newData);
        newNode.next = head;
        head = newNode;
    }

    void deleteFromBeginning() {

        head = head.next;
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

    void deleteFromEnd() {

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
    }

    SingleNode deleteFromAnyPosition(int position) {

        SingleNode temp = head;
        SingleNode previous = head;

        for (int i = 0; i < position; i++) {

            if (i == 0 && position == 1) {

                head = head.next;

            } else {

                if (i == position - 1 && temp != null) {

                    previous.next = temp.next;

                } else {

                    previous = temp;

                    if (previous == null)
                        throw new ArrayIndexOutOfBoundsException("Position is greater then arrays length - " + length());

                    temp = temp.next;
                }
            }
        }

        return head;
    }

    SingleNode reverse() {

        SingleNode previous = null;
        SingleNode current = head;
        SingleNode next;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;

        return head;
    }

    int getNthNode(int index) {

        int count = 0;
        SingleNode current = head;

        while (current != null) {

            if (count == index)
                return count;

            count++;
            current = current.next;
        }

        return 0;
    }

    int length() {

        int length = 0;

        while (head != null) {

            length++;

            head = head.next;
        }

        return length;
    }

    void printList() {

        SingleNode current = head;

        if (current == null) {

            throw new ArrayIndexOutOfBoundsException("Linked List is Empty");
        }

        while (current != null) {

            System.out.print(current.data);

            current = current.next;

            if (current != null) {

                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

}
