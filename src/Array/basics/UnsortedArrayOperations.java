package Array.basics;

public class UnsortedArrayOperations {

    int searchElement(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {

                return i;
            }
        }
        return -1;
    }

    int[] insertAtEnd(int[] array, int value) {

        int[] newArray = createAndCopyElementsToNewArray(array);

        newArray[array.length] = value;

        return newArray;
    }

    int[] insertAtPosition(int[] array, int position, int value) {

        int[] newArray = createAndCopyElementsToNewArray(array);

        for (int i = array.length - 1; i >= position; i--) {

            newArray[i + 1] = newArray[i];
        }

        newArray[position] = value;

        return newArray;
    }

    int[] deleteElement(int[] array, int value) throws NoSuchFieldException {

        int index = searchElement(array, value);

        if (index == -1) {

            throw new NoSuchFieldException("Element not found");
        }

        int newArraySize = array.length - 1;

        for (int i = index; i < newArraySize; i++) {

            array[i] = array[i + 1];
        }

        int[] newArray = new int[newArraySize];

        System.arraycopy(array, 0, newArray, 0, newArraySize);

        return newArray;
    }

    private int[] createAndCopyElementsToNewArray(int[] array) {

        int[] newArray = new int[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, array.length);

        return newArray;
    }


}
