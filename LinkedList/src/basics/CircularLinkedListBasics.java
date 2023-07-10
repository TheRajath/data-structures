package basics;

import static basics.InsertNode.inputData;

public class CircularLinkedListBasics {

    static CircularLinkedList initializeCircularLinkedList() {

        var circularLinkedList = new CircularLinkedList();
        circularLinkedList.push(1000);
        circularLinkedList.push(800);
        circularLinkedList.push(600);
        circularLinkedList.push(400);
        circularLinkedList.push(200);

        return circularLinkedList;
    }

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = initializeCircularLinkedList();

        System.out.println("1. Insert data at the beginning");

        int data = inputData();
        circularLinkedList.push(data);

        circularLinkedList.printList();
    }

}
