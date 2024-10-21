package LinkedList;

import java.util.Scanner;

import static LinkedList.InsertNode.insertInitialValues;

public class SearchData {

    private static int searchData(int data) {

        int position = 0;

        CustomLinkedList customLinkedList = insertInitialValues();

        SingleNode head = customLinkedList.head;

        while (head.next != null) {

            if (head.data == data) {

                return position;
            }

            head = head.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {

        int data = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the data:");

        if (scanner.hasNextInt()) {

            data = scanner.nextInt();
        }

        int position = searchData(data);

        if (position != -1) {

            System.out.println("Element found at " + position);

        } else {

            System.out.println("Element not found.");
        }

    }

}
