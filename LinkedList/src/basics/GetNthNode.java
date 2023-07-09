package basics;

import java.util.Scanner;

import static basics.InsertNode.insertInitialValues;

public class GetNthNode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomLinkedList customLinkedList = insertInitialValues();

        int index = 0;

        /*
        Position Starts with 1
        */

        System.out.println("Get Data of Nth node: ");

        if (scanner.hasNextInt()) {

            index = scanner.nextInt();
        }

        int data = customLinkedList.getNthNode(index);

        System.out.println("Data: " + data);
    }

}
