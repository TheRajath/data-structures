package LinkedList;

import java.util.Scanner;

import static LinkedList.InsertNode.insertInitialValues;

public class GetNthNodeFromEnd {

    private static int getNthNodeFromEnd(SingleNode head, int length, int index) {

        SingleNode temp;

        if (length < index)
            return 0;

        temp = head;

        for (int i = 1; i < length - index + 1; i++) {

            temp = temp.next;
        }

        return temp.data;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomLinkedList customLinkedList = insertInitialValues();
        SingleNode head = customLinkedList.head;

        int index = 0;

        /*
        Position Starts with 1
        */

        System.out.println("Get Data of Nth node: ");

        if (scanner.hasNextInt()) {

            index = scanner.nextInt();
        }

        int length = customLinkedList.length();

        int data = getNthNodeFromEnd(head, length, index);

        System.out.println("Data: " + data);
    }

}
