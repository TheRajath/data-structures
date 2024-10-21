package basics;

public class DynamicArray {

    private int[] array;
    private int size;
    private int count; // Depicts the number of elements added by you

    public DynamicArray() {

        array = new int[1];
        size = 1;
        count = 0;
    }

    void printArray() {

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

    void add(int data) {

        checkIfArrayIsFull();

        array[count] = data;
        count++;
    }

    void addAtIndex(int index, int data) {

        checkIfArrayIsFull();

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = count; i > index; i--) {

            array[i] = array[i - 1];
        }

        array[index] = data;
        count++;
    }

    private void checkIfArrayIsFull() {

        if (count == size) {

            growSize();
        }
    }

    private void growSize() {

        int[] temp = null;

        if (count == size) {

            temp = new int[size * 2];

            for (int i = 0; i < size; i++) {

                temp[i] = array[i];
            }
        }

        array = temp;

        size = size * 2;
    }

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("Dynamic Array Initialization");
        dynamicArray.printArray();

        System.out.println("After adding data to array");

        dynamicArray.add(1);
        dynamicArray.add(2);

        dynamicArray.printArray();

        System.out.println("Try to add data 45 at index 3");
        dynamicArray.addAtIndex(2, 45);
        dynamicArray.printArray();
    }

}
