package basics;

import static basics.InsertNode.insertInitialValues;

public class ReverseList {

    public static void main(String[] args) {

        CustomLinkedList customLinkedList = insertInitialValues();

        System.out.println("Original LinkedList");
        customLinkedList.printList(customLinkedList.head);

        System.out.println("Reverse LinkedList");
        SingleNode head = customLinkedList.reverse(customLinkedList.head);

        customLinkedList.printList(head);
    }

}
