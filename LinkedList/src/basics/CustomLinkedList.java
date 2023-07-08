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

    SingleNode deleteFromAnyPosition(SingleNode head, int position) {

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
                        throw new ArrayIndexOutOfBoundsException("Position is greater then arrays length - " + length(head));

                    temp = temp.next;
                }
            }
        }

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

    int getNthNode(SingleNode head, int index) {

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

            System.out.print(head.data);

            head = head.next;

            if (head != null) {

                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

}
