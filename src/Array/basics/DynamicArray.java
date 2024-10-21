package Array.basics;

public class DynamicArray {

    private int[] array;
    private int size;
    private int numberOfElementsAdded; // Depicts the number of elements added by you

    public DynamicArray() {

        array = new int[1];
        size = 1;
        numberOfElementsAdded = 0;
    }

    void printArray() {

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

    void add(int data) {

        checkIfArrayIsFull();

        array[numberOfElementsAdded] = data;
        numberOfElementsAdded++;
    }

    void addAtIndex(int index, int data) {

        checkIfArrayIsFull();
        checkIfIndexOutOfBound(index);

        for (int i = numberOfElementsAdded; i > index; i--) {

            array[i] = array[i - 1];
        }

        array[index] = data;
        numberOfElementsAdded++;
    }

    void remove() {

        if (numberOfElementsAdded > 0) {

            array[numberOfElementsAdded - 1] = 0;
            numberOfElementsAdded--;
        }
    }

    void removeAtIndex(int index) {

        checkIfIndexOutOfBound(index);

        for (int i = index; i < numberOfElementsAdded - 1; i++) {

            array[i] = array[i + 1];
        }

        array[numberOfElementsAdded - 1] = 0;
        numberOfElementsAdded--;
    }

    private void checkIfArrayIsFull() {

        if (numberOfElementsAdded == size) {

            growSize();
        }
    }

    private void growSize() {

        int[] temp = null;

        if (numberOfElementsAdded == size) {

            temp = new int[size * 2];

            for (int i = 0; i < size; i++) {

                temp[i] = array[i];
            }
        }

        array = temp;

        size = size * 2;
    }

    void shrinkSize() {

        int[] temp;

        if (numberOfElementsAdded > 0) {

            temp = new int[numberOfElementsAdded];

            for (int i = 0; i < numberOfElementsAdded; i++) {

                temp[i] = array[i];
            }

            size = numberOfElementsAdded;
            array = temp;
        }
    }

    private void checkIfIndexOutOfBound(int index) {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException("Index out of bounds");
        }

    }

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("Dynamic Array Initialization");
        dynamicArray.printArray();

        System.out.println("After adding data to array");

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        dynamicArray.printArray();

        System.out.println("Try to add data 45 at index 3");
        dynamicArray.addAtIndex(2, 45);
        dynamicArray.printArray();

        System.out.println("Removes the last element from array");
        dynamicArray.remove();
        dynamicArray.printArray();

        System.out.println("Removes the last element at index 3 from array (Position 4)");
        dynamicArray.removeAtIndex(3);
        dynamicArray.printArray();

        System.out.println("Array of the size shrink");
        dynamicArray.shrinkSize();
        dynamicArray.printArray();

    }

}
